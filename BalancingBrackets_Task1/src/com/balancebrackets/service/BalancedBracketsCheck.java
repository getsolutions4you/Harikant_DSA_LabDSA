package com.balancebrackets.service;

import java.util.Stack;

public class BalancedBracketsCheck {
	public boolean isMatchingPair(String str) {
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					return false;
				}
				char lastOpenBracket = stack.pop();
				if ((ch == ')' && lastOpenBracket != '(') || (ch == ']' && lastOpenBracket != '[')
						|| (ch == '}' && lastOpenBracket != '{')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
