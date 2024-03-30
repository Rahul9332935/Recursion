package com.recursion;

public class Main {
	public static void main(String[] args) {
		
		printNameNTimes("Rahul", 4);
		
	}
	public static void printNameNTimes(String name,int n) {
		if(n==0) {
			return;
		}
		System.out.println(name);
		printNameNTimes(name, n-1);
	}
}
