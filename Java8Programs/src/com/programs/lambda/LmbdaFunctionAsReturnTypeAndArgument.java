package com.programs.lambda;

interface ComplexMaths{
	public int multiply(int x);
}
interface Maths{
	public int calculate();
}


public class LmbdaFunctionAsReturnTypeAndArgument {
	
	static Maths addition(int a,int b,ComplexMaths calculation) {
		return ()-> calculation.multiply(a)+ calculation.multiply(b);
	}
	
	public static void main(String[] args) {
		System.out.println(addition(10, 20, x-> x*x).calculate());
		System.out.println(addition(2, 2, x-> x*x*x).calculate());
	}
	
	
	

}
