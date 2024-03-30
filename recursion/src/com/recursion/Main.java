package com.recursion;

public class Main {
	public static void main(String[] args) {
		
//		printNameNTimes("Rahul", 4);
//		print1ToN(9);
		int a= sum(10);
		int b= findFactorial(5);
		System.out.println(b);
		
	}
	public static void printNameNTimes(String name,int n) {
		if(n==0) {
			return;
		}
		System.out.println(name);
		printNameNTimes(name, n-1);
	}
	
	public static void print1ToN(int n) {
		if(n==0) {
			return;
		}
		print1ToN(n-1);
		System.out.println(n);
	}
	
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n+ sum(n-1);
	}
	
	public static int findFactorial(int n) {
		if(n==0) {
			return 1;
		}
		return n* findFactorial(n-1);
	}
	
	
}
