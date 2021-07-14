package com.bridgelabz.generics;

public class MaximumObject {
	int x,y,z,max; 
	float xf,yf,zf,maxf;
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
	
	public float maximum1(float xf,float yf,float zf) {
		maxf = xf;
		if(yf>maxf) {
			maxf = yf;
		}
		if(z>maxf) {
			maxf=zf;
		}
		printMax1(xf,yf,zf,maxf);
		return maxf;
	}
	
	public static void printMax(int x, int y, int z, int max) {
		System.out.println("Max of %s, %s and %s is %s\n"+x+" "+y+" "+z+" "+max);
	}
	
	public static void printMax1(float xf,float yf,float zf, float maxf) {
		System.out.println("Max of %s, %s and %s is %s\n"+xf+" "+yf+" "+zf+" "+maxf);
	}

	public static void main(String[] args) {
		MaximumObject maxObject = new MaximumObject();
		maxObject.maximum(4, 5, 6);
		
		MaximumObject maxObject1 = new MaximumObject();
		maxObject1.maximum1(4.2f, 5.3f, 6.4f);
	}

}
