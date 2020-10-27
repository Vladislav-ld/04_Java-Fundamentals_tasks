package by.htp.les06.HMA;

import java.util.Random;
import java.util.Scanner;

public class Hm2 {
	public static void main(String[] args) {
		int i;
		int j;
		int n;
		int m;
		int k;
		int p;
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		System.out.println("Введите количество строк");
		do
		{
			if(!sc.hasNextInt()) {
				sc.next();
			}
			n = sc.nextInt();
		} while(n <= 0);
		
		System.out.println("Введите количество столбцов");
		do
		{
			if(!sc.hasNextInt()) {
				sc.next();
			}
			m = sc.nextInt();
		} while(m <= 0);
		
		int[][] a = new int[n][m];

		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(100);
			}
		}
		
		System.out.println("Введите номер строки");
		do
		{
			if(!sc.hasNextInt()) {
				sc.next();
			}
			k = sc.nextInt();
		} while(k <= 0 && k > n);
		
		System.out.println("Введите номер столбца");
		do
		{
			if(!sc.hasNextInt()) {
				sc.next();
			}
			p = sc.nextInt();
		} while(p <= 0 && p > m);
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			System.out.println(";");
		}
		
		for(i = 0; i < a[k - 1].length;i++) {
			System.out.print(a[k - 1][i] + " ");
		}
		
		System.out.println();
		
		for(i = 0; i < a.length;i++) {
			System.out.print(a[i][p - 1] + " ");
		}
	}

}
