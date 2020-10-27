package by.htp.les06.HMA;

import java.util.Random;
import java.util.Scanner;

public class Hm12 {

	public static void main(String[] args) {
		int i;
		int j;
		int m;
		int n;
		int count = 0;

		Random rand = new Random();

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
		
		for(i = 0; i < a[0].length; i++) {
			count = 0;
			for(j = 0; j < a.length; j++) {
				if(a[j][i] == 0) {
					a[j][i] = rand.nextInt(2);
				}
				
				if(a[j][i] == 1) {
					count++;
				}
				
				if(count == (i + 1)) {
					j = a.length;
				}
				
				if(j == a.length - 1) {
					if(count != (i + 1)) {
						j = 0;
					}
				}
			}
		}
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			System.out.println();
		}
	}
}
