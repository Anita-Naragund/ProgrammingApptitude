package com.xworkz.patterns.alphabets;

public class LAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=num;j++) {
				if(j==0 || i==4) {
					System.out.print("*");
				}else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
	}

	}


