package primes;

import java.util.Scanner;

/**
 * This is a program to test whether two numbers are twin primes. A twin prime is defined as a prime 
 * number that is either 2 less or 2 more than another prime number. For example, the number 11 is 
 * considered a twin prime to the number 13, as both are prime numbers and have a prime gap of 2.
 * 
 * The program consists of three methods. The first method tests whether or not a given number is prime.
 * The second method takes two numbers as parameters and determines whether the two numbers are twin 
 * primes. The third method is the main method, which makes use of the two methods by prompting the 
 * user to enter two numbers. After the user inputs the numbers, it will print a message stating that 
 * the numbers are either twin primes or not twin primes.
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
	 * The main method which makes use of the areTwinPrimes method.
	 * @param args Unused.
	 * @return Nothing.
	 * @exception IOException on input error.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner where user input will be read
		
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
	}

}
