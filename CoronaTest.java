package com.coronatest;

import java.util.Scanner;

public class CoronaTest {

	public static void main(String[] args) {
		

		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter follwing details to check corona test ::");
		System.out.println("Do you have high fever :: 0 for no , 1 for yes");
		int f = scn.nextInt();
		System.out.println("Do you have cough :: 0 for no , 1 for yes");
		int c = scn.nextInt();
		System.out.println("Do you have cold :: 0 for no , 1 for yes");
		int cold = scn.nextInt();
		int count = f+c+cold;
		if(count==3) {
			System.out.println("corona test is Positive");
		}else {
			System.out.println("corona test is negative");
		}
		
		

	}

}
