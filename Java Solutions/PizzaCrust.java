import java.util.Scanner;

public class PizzaCrust {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double crust = radius - sc.nextDouble();
		
		double areaTotal = Math.PI * radius * radius;
		double areaCheese = Math.PI * crust * crust;
		
		double cheeseAmount = (areaCheese / areaTotal)*100;
		
		System.out.println(cheeseAmount);
	}

}
