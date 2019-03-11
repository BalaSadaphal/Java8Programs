package com.programs.treeTraversal;

public class Test {
	static int count=0;
	public static void main(String[] args) {
		fun1();
	}
	
	private static void fun1() {
		if(count>5) {
			return;
		}
		count++;
		System.out.println(count);
		fun1();
	}
}
