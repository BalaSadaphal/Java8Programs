package com.programs.lambda;

interface Operations {
	int operate(int a);
}

public class LamdaAsArgument {
	static int sum(int a, int b, Operations operations) {
		return operations.operate(a) + operations.operate(b);
	}

	public static void main(String[] args) {
		System.out.println("Passing lambda as a argument\n");

		System.out.println("Sum of Sqaures of numbers 1, 2 ->    " + sum(1, 2, a -> a * a));
		System.out.println("Sum of Cubes of numbers 1, 2   ->    " + sum(1, 2, a -> a * a * a));

		System.out.println("\n<===========================>\n");

		int nCr_10_2 = nCr(10, 2, x -> {
			int i = x - 1;
			while (i > 0) {
				x = x * i;
				i--;
			}
			return x;
		});
		System.out.println("nCr_10_2 = " + nCr_10_2);
	}

	static int nCr(int n, int r, Operations operations) {
		return operations.operate(n) / (operations.operate(n - r) * operations.operate(r));
	}

}
