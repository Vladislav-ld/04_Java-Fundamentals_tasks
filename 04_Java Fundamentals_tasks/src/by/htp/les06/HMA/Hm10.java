package by.htp.les06.HMA;

import java.util.Random;
import java.util.Scanner;

public class Hm10 {

	public static void main(String[] args) {
		int i;
		int j;
		int n;	

		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество элементов");
		do {
			if(!sc.hasNextInt()) {
				sc.next();
			}
			n = sc.nextInt();
		} while(n % 2 != 0);

		int[][] a = new int[n][n];
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				a[j][i] = rand.nextInt(10) - 5;
			}
		}
		
		for(i = 0; i < a.length; i++) {
			if(a[i][i] > 0) {
				System.out.print(a[i][i] + " ");
			}
		}
		System.out.println();
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			System.out.println();
		}

	}

}
