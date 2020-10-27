package by.htp.les06.HMA;

import java.util.Random;
import java.util.Scanner;

public class HMA {

	public static void main(String[] args) {
		int n;
		int i;
		int j;
		
		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество");
		do
		{
			if(!sc.hasNextInt()) {
				sc.next();
			}
			n = sc.nextInt();
		} while(n <= 0);
		
		int[][] a = new int[n][n];

		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(100);
			}
		}
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			System.out.println(";");
		}
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				if(i == j) {
					System.out.print(" " + a[i][j]);
				}
			}
		}

	}

}
