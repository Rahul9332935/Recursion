package com.recursion;

public class DecimalToBinary {

	public static String decimaltoBinary(int num, String result ) {
		if(num == 0) {
			return  result;
		}
		
		result= num%2 +result;
		return decimaltoBinary(num/2, result);
		
	}
	public static void main(String[] args) {
		System.out.println(decimaltoBinary(25, ""));
	}
}
