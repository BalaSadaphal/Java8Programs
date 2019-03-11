package com.programs.stack;

import java.util.Stack;

public class FindOutBalancedParenthesis {
	public static void main(String[] args) {
		System.out.println(balancedParentheses("()("));
	}

	public static int balancedParentheses(String str) {
		int count = 0;
		Character[] c = { '(', ')' };
		Stack<Character> stack = new Stack<Character>();
		char[] chars = str.toCharArray();
		if (chars.length % 2 == 0) {
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == c[0]) {
					stack.push(chars[i]);
				} else if (chars[i] == c[1]) {
					char poppedChar = !stack.isEmpty() ? stack.pop() : 'N';
					if (poppedChar == c[0])
						count++;
					else
						count = -1;
				}
			}
			return count;
		} else
			return -1;
	}

}
