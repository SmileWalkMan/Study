package com.jj.math;

import java.util.Random;
/**
 * 
 * 生成 100 以内的加减法
 *
 */
public class Onehundred {

	public static String one() {
		Random random = new Random();
		int a = random.nextInt(90)+11;
		int b = random.nextInt(a)+10;
		int c=a-b;
		while(c<=0) {
			b = random.nextInt(a)+10;
			c=a-b;
		}
		int zz=random.nextInt(2);
		if(zz==0) {
			String B = b+"";
			if(b<10) B+=" ";
			String C = c+"";
			if(c<10) C+=" ";
			if(random.nextInt(2)==0)
				return B+"+"+C+"=";
			else
				return C+"+"+B+"=";
		}else {
			String B = b+"";
			if(b<10) B+=" ";
			String A = a+"";
			if(a<10) A+=" ";
			return A+"-"+B+"=";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=2000;i++) {
			System.out.print(one());
			if(i%4==0)System.out.println();
			else System.out.print("        ");
		}
	}

}
