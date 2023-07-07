
	import java.util.Scanner;
	public class SumOfTwoNumbers {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        double num1 = input.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = input.nextDouble();

	        double sum = num1 + num2;

	        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
	    }
	}


