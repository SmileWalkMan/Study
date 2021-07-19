package com.jj.math;

public class DaJiuJiu {

	static int count=1;
	public static void output(int number) {
		
		for (int i=number;i<20;i++) {
			System.out.println(number+"X"+i+"="+number*i);
			count=count+1;
		}

	}
	public static void main(String[] args) {
		for(int i=1;i<20;i++) {
			output(i);
			System.out.println("=================");
		}
		System.out.println(count);
	}

}
