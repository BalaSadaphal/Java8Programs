package com.programs.arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 12, 7, 15, 9 };
		int outputArr[] = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			outputArr[j] = arr[i];
			System.out.println(arr[i]);
		}
	}
}
