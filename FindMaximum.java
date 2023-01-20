package com.blz.generics;

public class FindMaximum {

	int p, q, r;
	
	public FindMaximum(int p, int q, int r) {
	
	this.p = p;
	this.q = q;
	this.r = r;
	}
	
	public static <T extends Comparable <T>> T findMaximum(T p , T q, T r) {
		
		T max = p;              //Initializing p as greater
		if(q.compareTo(max) > 0)
			max = q;                 // now q is greater
		if(r.compareTo(max) > 0)
			max = r;                 //now r is greater
		printMax (p, q, r, max);
		
		return max;
	}

	private static <T> void printMax(T p , T q, T r, T max) {
		
		System.out.printf("the max of value is ", p, q, r, max);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to find Maximum problem using Generics \n ");
		System.out.println("The maximum value between the three integer is " +findMaximum(3, 8, 5) + "\n");
		System.out.println("The maximum value between the three float is " +findMaximum(1.5f, 3.56f, 5.87f) + "\n");
		System.out.println("The maximum value between the three String is " +findMaximum("abc", "pqr", "xyz") + "\n");
		
	}
}
