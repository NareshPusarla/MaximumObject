package com.bridgelabz.generics;

public class MaximumObject <T extends Comparable<T>> {
	T x,y,z;
	
	public MaximumObject(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	
	
	public  T maximum() {
		return MaximumObject.maximum(x,y,z);
	}
	
	public static <T extends Comparable<T>> T maximum(T x, T y,T z) {
		T max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		printMax(x, y, z, max);
		return z;
	}
	
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.println("Max of %s, %s and %s is %s\n"+x +" "+y+" "+ z+" "+ max);
	}

	public static void main(String[] args) {
		Integer x = 3, y = 4, z = 5;
		Float xf =  6.1f, yf = 4.115f, zf = 5.1f;
		
		MaximumObject maxObject = new MaximumObject(x, y, z);
		maxObject.maximum();
		
		MaximumObject maxObject1 = new MaximumObject(xf, yf, zf);
		maxObject1.maximum();
	}

}
