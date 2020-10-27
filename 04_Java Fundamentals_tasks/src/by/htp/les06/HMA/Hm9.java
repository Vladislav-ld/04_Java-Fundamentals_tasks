package by.htp.les06.HMA;

import java.util.Scanner;

public class Hm9 {

	public static void main(String[] args) {
		int i;
		int j;
		int n;	

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество элементов");
		if(!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();
		
		int[] b = new int[n];
		
		int[][] a = new int[n][n];
		
		System.out.println("Задайте массив");
		for(i = 0; i < b.length; i++) {
			if(!sc.hasNextInt()) {
				sc.next();
			}
			b[i] = sc.nextInt();
		}
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				a[j][i] = (int) Math.pow(b[i],j +1);
			}
		}
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			System.out.println();
		}
	}

}
