package com.line;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to line comparison computation program");
		int x1,x2,y1,y2;
		x1=5;
		x2=10;
		y1=8;
		y2=10;
		
		int a1,a2,b1,b2;
		a1=5;
		a2=10;
		b1=8;
		b2=10;
		
		double len1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println(len1);
		double len2=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		System.out.println(len2);
	}

}
