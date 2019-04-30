//https://projecteuler.net/problem=16

import java.math.BigInteger;

public class PowerDigitSum {
	public static void main(String[] args) {
		BigInteger num = new BigInteger("2");
		BigInteger newNum = num.pow(1000);
		BigInteger sum = BigInteger.ZERO;
		
		
		while(!newNum.equals(BigInteger.valueOf(0))) {
			BigInteger modNum = newNum.remainder(BigInteger.valueOf(10));
			sum = sum.add(modNum);
			newNum = newNum.divide(BigInteger.valueOf(10));
		}
		
		System.out.println(sum);

	}

}
