package by.htp.les06.HMA;

import java.util.Random;
import java.util.Scanner;

public class Hm3 {

	public static void main(String[] args) {
		int m;
		int n;
		int j;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество строк");
		if(!sc.hasNextInt()) {
			sc.next();
		}
		m = sc.nextInt();
		
		System.out.println("Введите количество столбцов");
		if(!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();
		
		int[][] a = new int[m][n];
		
		Random rand = new Random();
		
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
			if((i ) % 2 != 0) {
				for(j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println(";");
			} else {
				for(j = a[i].length - 1; j >= 0; j--) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println(";");
			}
		}

	}

}
