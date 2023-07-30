package com.balancebrackets.main;

import com.balancebrackets.service.BalancedBracketsCheck;

public class Driver {

	public static void main(String[] args) {

		BalancedBracketsCheck bb = new BalancedBracketsCheck();

		String input1 = "( [ [ { } ] ] )";
		String input2 = "( [ [ { } ] ] ) )";

		System.out.println("Sample Input");
		System.out.println(input1);
		if (bb.isMatchingPair(input1)) {
			System.out.println("Sample Output");
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("Sample Output");
			System.out.println("Sample Output: The entered String does not contain Balanced Brackets");
		}

		System.out.println("\nSample Input");
		System.out.println(input2);
		if (bb.isMatchingPair(input2)) {
			System.out.println("Sample Output");
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("Sample Output");
			System.out.println("The entered String does not contain Balanced Brackets");
		}

	}

}
