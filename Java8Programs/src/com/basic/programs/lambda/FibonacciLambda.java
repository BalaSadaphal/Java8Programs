package com.basic.programs.lambda;

//@FunctionalInterface
interface FibonacciCalculator {
	void fibonacci(int limit);
}

public class FibonacciLambda {
	public static void main(String[] args) {
		FibonacciCalculator calculate = (int limit) -> {
			int previous = 0;
			int current = 1;
			System.out.println("Fibonacci Series :");
			while (current < limit) {
				int temp = current;
				current = previous + current;
				previous = temp;
				System.out.print(current + " ");
			}
		};
		calculate.fibonacci(20);
	}

}
