package com.recursion;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[][] arr =new int[][] {{1,0}, {2,4},{3,1},{4,-5}};
		
		Arrays.sort(arr, (o1, o2) -> o1[1]-o2[1] );
		System.out.println(Arrays.deepToString(arr));
		
		
		
	}
}
