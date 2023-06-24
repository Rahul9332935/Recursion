package com.recursion;

public class BinarySearch {

	public static int binarySearch(int[] arr, int k, int left, int right) {
		if(left> right) {
			return -1;
		}
		int mid = left+ (right-left)/2;
		if(arr[mid]==k) {
			return mid;
		}
		if(arr[mid] > k) {
			return binarySearch(arr, k, left, mid-1);
		}
		return binarySearch(arr, k, mid+1, right);
	}
	public static void main(String[] args) {
		int[] arr =new int[] {2,12,15,49,50,80,85,95,105,109};
		System.out.println(binarySearch(arr, 95, 0, arr.length-1));
	}
}
