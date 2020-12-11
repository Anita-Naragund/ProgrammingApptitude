package com.xworkz.patterns;

public class Diagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		int mid=num/2;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i==mid || i==j || i+j==num || j==mid) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
