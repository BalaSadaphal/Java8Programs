package com.programs.lambda;

interface Operation{
	int calculate(int x);
}

public class LambdaFunctionAsReturnType {

	public static Operation square() {
		Operation operation= x-> x*x;
		return operation;
	}
	public static Operation cube() {
		Operation operation= x-> x*x*x;
		return operation;
	}
	
	public static void main(String[] args) {
		Operation operation = square();
		System.out.println(operation.calculate(10));
		System.out.println(cube().calculate(10));
	}
}

