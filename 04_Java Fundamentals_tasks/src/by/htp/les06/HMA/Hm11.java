package by.htp.les06.HMA;

import java.util.Random;
import java.util.Scanner;

public class Hm11 {

	public static void main(String[] args) {
		int i;
		int j;
		int n = 10;
		int m = 20;
		int count = 0;

		Random rand = new Random();

		int[][] a = new int[n][m];
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(16);
			}
		}
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			System.out.println();
		}
		
		for(i = 0; i < a.length; i++) {
			count = 0;
			for(j = 0; j < a[i].length; j++) {
				if(a[i][j] == 5) {
					count++;
				}
			}
			if(count >= 3) {
				System.out.println("Номер строки с тремя и более 5-ми: " + (i + 1));
			}
		}

	}

}
