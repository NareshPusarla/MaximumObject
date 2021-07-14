package com.bridgelabz.generics;

public class MaximumObject<T extends Comparable<T>> {
	T x,y,z;
	
	public MaximumObject(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public T maximum() {
		return MaximumObject.maximum(x, y, z);
	}
	
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

	public static String testMaximum(String x, String y, String z) {
		String max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(y.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
	}
	
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.println("Max of these is\n"+x+" "+y+" "+z+" "+max);
	}
	
	public static void main(String[] args) {
		Integer xi=4, yi=5, zi=6;
		Float xf=4.6f, yf=5.5f ,zf=6.7f;
		String xs="Apple", ys="Peach", zs="Banana";
		
		MaximumObject maxObject = new MaximumObject(xi, yi, zi);
		maxObject.maximum();
		
		MaximumObject maxObject1 = new MaximumObject(xf, yf, zf);
		maxObject1.maximum();
		
		MaximumObject maxObject2 = new MaximumObject(xs, ys, zs);
		maxObject2.maximum();
	}

}
