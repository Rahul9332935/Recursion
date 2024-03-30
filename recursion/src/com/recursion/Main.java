package com.recursion;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
//		printNameNTimes("Rahul", 4);
//		print1ToN(9);
		int a= sum(10);
		int b= findFactorial(5);
		int[] arr = {2,4,6,9,6};
		reverseArray(arr, 0, arr.length);
		
		
		System.out.println(Arrays.toString(arr));
		
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
	
	public static void reverseArray(int[] arr, int i, int n) {
		if(i>= n/2) {
			return;
		}
		swap(arr, i, n-i-1);
		reverseArray(arr, i+1, n);
	}
	private static void swap(int[] arr, int i, int j) {
		int temp= arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
		
	}
}
