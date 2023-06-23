package com.recursion;

public class Palindrome {

	public static boolean isPalindrome(String str) {
		if(str.length()==0 || str.length()==1) {
			return true;
		}
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			return isPalindrome(str.substring(1,str.length()-1));
		}
		return false;		
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("heeheeh"));
		System.out.println("hello".substring(1, 4));
	}
}
