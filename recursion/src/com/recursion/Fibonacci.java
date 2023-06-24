package com.recursion;

public class Fibonacci {

	/*if n=0 res=0
	 * if n=1 res=1
	 * n=2 res= f1+f0 = 0+1=1
	 * n=3 res= f2+f1 = 1+1 =2;
	 * n=4 res= f3+f2 = 2+1 =3;
	 */
	// not optimized
	public static int fibonacciSum(int n) {
		if((n==0 )|| (n==1)) {
			return n;
		}
		return fibonacciSum(n-1)+fibonacciSum(n-2);
	}
	
	public static long fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		long[] dp =new long[n+1];
		dp[0]=0;
		dp[1]=1;
		long sum= dp[0]+dp[1];
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
			sum +=dp[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(30));
	}
}
