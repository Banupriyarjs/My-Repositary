package exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		  int g;

		    Scanner input = new Scanner(System.in);
		    Random r = new Random();
		    int a = r.nextInt(10) + 1;
		while(true) {
		    try {
		        System.out.print("Enter your guess: ");
		         g = input.nextInt();
		        if (g == a) {

		            System.out.println("**************");
		            System.out.println("*  YOU WON!  *");
		            System.out.println("**************");
		            System.out.println("Thank you for playing!");

		        } else if (g != a) {
		            System.out.println("Sorry, better luck next time!");
		        }
		        break;
		    } catch (InputMismatchException e) {
		        System.err.println("Not a valid input. Error :" + e.getMessage());
		        continue;
		    }
		}

	}

}
