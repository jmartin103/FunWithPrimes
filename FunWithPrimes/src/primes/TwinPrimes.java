package primes;

import java.util.Scanner;

/**
 * This is a program that works with twin primes. A twin prime is defined as a prime number that is 
 * either 2 less or 2 more than another prime number. For example, the number 11 is considered a twin 
 * prime to the number 13, as both are prime numbers and have a prime gap of 2. These can also be 
 * called prime pairs.
 * 
 * The program allows the user to test two numbers to determine whether they are prime pairs, or to 
 * specify a range to print all of the prime pairs between 2 and the given range. For example, if 
 * the user enters a range of 200, the program will print all prime pairs from 2 to 200. It will 
 * display a menu of possible options, and the user will enter the option that they want. If the 
 * user enters an invalid option, they will be re-prompted for a valid response. The program will 
 * continue to run until the user enters 'q' or 'Q', in which case the program will terminate.
 * 
 * @author John Martin
 *
 */

public class TwinPrimes {

	/**
	 * A method to test whether a given number is prime.
	 * @param num The number to be tested whether it is prime or not
	 * @return true if the number is a prime number, false otherwise
	 */
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * A method to determine whether two given numbers are twin primes.
	 * @param num1 The first number to be tested
	 * @param num2 The second number to be tested
	 * @return true if both numbers are prime and contain a prime gap of 2; false otherwise
	 */
	public static boolean areTwinPrimes(int num1, int num2) {
		if (isPrime(num1) && isPrime(num2) && Math.abs(num1 - num2) == 2) {
			return true;
		}
		return false;
	}
	
	/**
	 * A method to print all of the twin prime pairs between 2 and a given range.
	 * @param range The maximum range specified by the user.
	 * @return Nothing.
	 */
	public static void printPrimePairs(int range) {
		for (int i = 2; i <= range; i++) {
			if (areTwinPrimes(i, i + 2)) {
				System.out.println(i + ", " + (i + 2));
			}
		}
	}
	
	/** 
	 * A method to print a menu of options for the user to choose from.
	 * @return Nothing.
	 */
	public static void menu() {
		System.out.println("T - Test two numbers to determine if they are twin primes\n"
						 + "P - Print all twin prime pairs within a certain range\n"
						 + "Q - Quit program");
	}
	
	/** 
	 * The main method which makes use of all methods. It asks the user whether they wish to 
	 * test two numbers to see if they are prime pairs, to print all prime pairs within a 
	 * given range, or if they wish to terminate the program.
	 * @param args Unused.
	 * @return Nothing.
	 * @exception IOException on input error.
	 */
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in); // Scanner where user input will be read
			menu();
			
			System.out.print("Please select an option from the menu: ");
			char choice = sc.nextLine().charAt(0); // Read the user's choice
			
			switch (choice) {
			case 't': case 'T': // Test two numbers to see if they are twin primes
				System.out.print("Enter first number: ");
				int num1 = sc.nextInt();
				
				System.out.print("Enter second number: ");
				int num2 = sc.nextInt();
				
				if (areTwinPrimes(num1, num2)) {
					System.out.println(num1 + " and " + num2 + " are twin primes");
				}
				else {
					System.out.println(num1 + " and " + num2 + " are not twin primes");
				}
				break;
			case 'p': case 'P': // Print all twin primes within a certain range
				System.out.print("Enter a range: ");
				int range = sc.nextInt();
				
				System.out.println("The twin range pairs from 2 to " + range + " are as follows: ");
				printPrimePairs(range);
				break;
			case 'q': case 'Q': // Terminate program
				System.exit(0);
			default: // User entered invalid choice, re-prompt user for response
				System.out.println("Invalid option; please try again");
				continue;
			}
		}
	}
}
