package com.xworkz.patterns;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		int mid=num/2;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i+j==mid || j-i==mid || i==mid || i==mid || i-j==mid || i+j==num+mid) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}
}
