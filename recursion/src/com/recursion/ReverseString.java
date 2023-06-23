package com.recursion;

public class ReverseString {
	/**
	 * 
	 * @param str "hello world"
	 * @return reverse String ex- "dlrow olleh";
	 */
	public static String reverse(String str) {
		//base case 
		if(str.equals("")) {
			return "";
		}
		return reverse(str.substring(1))+ str.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println(reverse("hello world"));//dlrow olleh
	}
}
