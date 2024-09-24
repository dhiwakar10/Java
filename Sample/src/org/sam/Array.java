package org.sam;

public class Array {
	public static void main(String[]args) {
		int a[][] = new int [3][3];
		a[0][0]=10;
		a[0][1]=15;
		a[0][2]=20;
		a[1][0]=25;
		a[1][1]=30;
		a[1][2]=35;
		a[2][0]=40;
		a[2][1]=45;
		a[2][2]=50;
		
		
		
		for(int[]b:a) {
			for(int c:b) {
				System.out.println(c);
			}
		}
	 }		
}		

