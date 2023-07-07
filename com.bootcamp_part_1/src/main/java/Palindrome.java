import java.util.Scanner;
public class Palindrome {


		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter a string:  ");
		        String str = input.nextLine();

		        String reverseStr = new StringBuilder(str).reverse().toString();

		        if (str.equals(reverseStr))
		            System.out.println(str + " is a palindrome.");
		        else
		            System.out.println(str + " is not a palindrome.");
		    }
		}

	


