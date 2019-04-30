//https://projecteuler.net/problem=20

import java.math.BigInteger;

public class FactorialDigitSum {

	public static void main(String[] args) {
		
		BigInteger product = new BigInteger("100").multiply(new BigInteger("99"));
		
		for(int i = 98; i > 0; i--) {
			product = product.multiply(BigInteger.valueOf(i));
		}
		
		BigInteger sum = BigInteger.ZERO;
		
		while(!product.equals(BigInteger.valueOf(0))) {
			BigInteger modNum = product.remainder(BigInteger.valueOf(10));
			sum = sum.add(modNum);
			product = product.divide(BigInteger.valueOf(10));
		}
		System.out.println(sum);
	}
}
