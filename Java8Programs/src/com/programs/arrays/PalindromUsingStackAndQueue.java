package com.programs.arrays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromUsingStackAndQueue {
	public static void main(String[] args) {
		usingQueue();
	}
	private static void usingStack() {
		Boolean isPalindrome = true;
		String str = "radarr";
		Stack<String> stack = new Stack<String>();
		String[] split = str.split("");
		int mid = (split.length + 1) / 2;
		for (int i = 0; i < mid; i++) {
			stack.push(split[i]);
		}
		System.out.println("stack=>" + stack.toString());
		if (split.length % 2 == 0) {
			mid = mid + 1;
		}
		for (int i = mid - 1; i < split.length; i++) {
			String ele = stack.pop();
			System.out.println(ele + " == " + split[i]);
			if (!ele.equals(split[i])) {
				isPalindrome = false;
			}
		}
		String output = isPalindrome ? (String.format("String %s is palindrome", str))
				: (String.format("String %s is not palindrome", str));

		System.out.println(output);
	}
	 public static void usingQueue() {
	        String inputString = "radarr";
	        Queue<Character> queue = new LinkedList<Character>();

	        for (int i = inputString.length()-1; i >=0; i--) {
	            queue.add(inputString.charAt(i));
	        }

	        String reverseString = "";

	        while (!queue.isEmpty()) {
	            reverseString = reverseString+queue.remove();
	        }
	        if (inputString.equals(reverseString))
	            System.out.println("The input String is a palindrome.");
	        else
	            System.out.println("The input String is not a palindrome.");

	    }
}
