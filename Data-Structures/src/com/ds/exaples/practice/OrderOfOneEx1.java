package com.ds.exaples.practice;

import java.util.Date;

public class OrderOfOneEx1 {
	
	public static void simpleMath(int n) {
		int a = 5;
		int b = 6;
		
		int sum = a+b +n;
		int diff= b-a*n;
		int mul = a*b/n;
		System.out.println("N is "+n);
		
		System.out.println( "sum: ==== " + sum + " diff ==== " + diff + " mul ===="+ mul);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println("before "+new Date());
		
		simpleMath(10000);
		
		System.out.println("after "+new Date());
	}

}
