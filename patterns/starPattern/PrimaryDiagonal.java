package com.xworkz.patterns.starPattern;

public class PrimaryDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= num; j++) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
