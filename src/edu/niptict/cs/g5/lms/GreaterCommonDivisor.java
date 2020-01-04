package edu.niptict.cs.g5.lms;

import java.util.Scanner;

import static java.lang.System.gc;
import static java.lang.System.out;

class GreaterCommonDivisor {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.println("Enter a first value: ");
		int firstVal = input.nextInt();
		out.println("Enter a second value: ");
		int secondVal = input.nextInt();

		GreaterCommonDivisor greaterCommonDivisor = new GreaterCommonDivisor();
		
		int gcd = greaterCommonDivisor.gcd(firstVal, secondVal);
		
		out.println("GCD for " + firstVal  + " and " + secondVal + " is " + gcd);
	}

	public int gcd(int firstVal, int secondVal) {
		int gcd = 1; // initial GCD is 1
		int k = 2; // Possible GCD

		while (k <= firstVal && k <= secondVal) {
			if (firstVal % k == 0 && secondVal % k == 0)
				gcd = k;

			k++;
		}

		return gcd;
	}

}