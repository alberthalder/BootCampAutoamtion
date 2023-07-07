
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = input.nextLine();

		String reverseStr = new StringBuilder(str).reverse().toString();

		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + reverseStr);
	}
		
	}


