package com.bridgelabz.generics;

public class MaximumObject {
	
	public int maximum(int x,int y,int z) {
		int max = x;
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
		float maxf = xf;
		if(yf>maxf) {
			maxf = yf;
		}
		if(zf>maxf) {
			maxf=zf;
		}
		printMax1(xf,yf,zf,maxf);
		return maxf;
	}
	
	public String maximum2(String xs, String ys, String zs) {
		String maxs = xs;
		if(ys.compareTo(maxs)>0) {
			maxs = ys;
		}
		if(ys.compareTo(maxs)>0) {
			maxs=zs;
		}
		printMax2(xs,ys,zs,maxs);
		return maxs;
	}
	
	public static void printMax(int x, int y, int z, int max) {
		System.out.println("Max of %s, %s and %s is %s\n"+x+" "+y+" "+z+" "+max);
	}
	
	public static void printMax1(float xf,float yf,float zf, float maxf) {
		System.out.println("Max of %s, %s and %s is %s\n"+xf+" "+yf+" "+zf+" "+maxf);
	}

	public static void printMax2(String xs, String ys, String zs, String maxs) {
		System.out.println("Max of these string is\n"+xs+" "+ys+" "+zs+" "+maxs);
	}
	
	public static void main(String[] args) {
		MaximumObject maxObject = new MaximumObject();
		maxObject.maximum(4, 5, 6);
		
		MaximumObject maxObject1 = new MaximumObject();
		maxObject1.maximum1(4.2f, 6.4f, 5.3f);
		
		MaximumObject maxObject2 = new MaximumObject();
		maxObject2.maximum2("Apple","Peach","Banana");
	}

}
