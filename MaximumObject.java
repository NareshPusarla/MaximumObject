package com.bridgelabz.generics;

public class MaximumObject {
	
	public static <T extends Comparable<T>> T maximum(T x,T y,T z) {
		
		T max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.println("Max of these is\n"+x+" "+y+" "+z+" "+max);
	}
	
	public static void main(String[] args) {
		MaximumObject maxObject = new MaximumObject();
		maxObject.maximum(4,5,6);
		
		MaximumObject maxObject1 = new MaximumObject();
		maxObject1.maximum(4.1,5.2,6.3);
		
		MaximumObject maxObject2 = new MaximumObject();
		maxObject2.maximum("Apple","Banana","Peach");
	}

}
