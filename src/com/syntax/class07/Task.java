package com.syntax.class07;

public class Task {
	public static void main(String[] args) {

		System.out.println("How to print odds numbers from 1 to 20");
		// 1,3,5,7,9,11,13,15,17,19

		// 1st way, using mod (%)

		int h = 1;
		while (h < 20) {
			if (h % 2 == 1) {
				System.out.println(h);
			}
			h++;
		}

		System.out.println("------------------------------");

		// 2nd way, increasing by 2

		int s = 1;
		while (s < 20) {
			System.out.println(s);
			s += 2;

		}
		//3rd way
		int r = 0;
		while (r < 20) {
			r++;
			System.out.println(r);
			r++;
		}
		// 4rd way
		int g = 0;
		while (g < 20) {
			System.out.println(++g);
			g++;
			
		}
		
		// How to print from 50 to 1;

		System.out.println("------------------------------");
		System.out.println("How to print from 50 to 1");

		int k = 50;
		while (k >= 1) {
			System.out.println(k);
			--k;
		}

	}

}
