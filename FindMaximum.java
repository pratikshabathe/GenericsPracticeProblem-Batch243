package com.blz.generics;

public class FindMaximum {

	int p, q, r;
	
	public FindMaximum(int p, int q, int r) {
	
	this.p = p;
	this.q = q;
	this.r = r;
	}
	
	public static Float findMaximum(Float p , Float q, Float r) {
		Float max = p;              //Initializing p as greater
		if(q.compareTo(max) > 0)
			max = q;                 // now q is greater
		if(r.compareTo(max) > 0)
			max = r;                 //now r is greater
		printMax (p, q, r, max);
		
		return max;
	}

	private static void printMax(Float p, Float q, Float r, Float max) {
		
		System.out.printf("the max of value is ", p, q, r, max);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to find Maximum problem using Generics \n ");
		System.out.println("The maximum value between the three integer is " +findMaximum(3.3f, 8.2f, 5.7f));
		
	}
}
