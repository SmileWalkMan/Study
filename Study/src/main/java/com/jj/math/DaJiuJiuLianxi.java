package com.jj.math;

import java.util.Random;

public class DaJiuJiuLianxi {

	public static void output(int number) {
		Random random = new Random();
		for(int i=1;i<=number;i++) {
			int a = random.nextInt(19)+1;
			int b = random.nextInt(19)+1;
			String A=a+"";
			if(a<10) {
				A+=" ";
			}
			String B=b+"";
			if(b<10) {
				B+=" ";
			}
			System.out.print(A+"X"+B+"=    ");
			if(i%4==0)
				System.out.println();
		}
	}
	public static void main(String[] args) {
		output(1000);
	}

}
