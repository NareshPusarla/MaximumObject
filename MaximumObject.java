package com.bridgelabz.generics;

public class MaximumObject {
	int x,y,z,max;
	public int maximum(int x,int y,int z) {
		max = x;
		if(y>max) {
			max = y;
		}
		if(z>max) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
	}
	
	public static void printMax(int x, int y, int z, int max) {
		System.out.println("Max of %s, %s and %s is "+x+" "+y+" "+z+" "+max);
	}

	public static void main(String[] args) {
		MaximumObject maxObject = new MaximumObject();
		maxObject.maximum(4, 5, 6);
	}

}
