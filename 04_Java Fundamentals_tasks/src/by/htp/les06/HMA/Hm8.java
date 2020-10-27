package by.htp.les06.HMA;

import java.util.Scanner;

public class Hm8 {

	public static void main(String[] args) {
		int i;
		int j;
		int n;	
		int k = 0;
		int c = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите четное число");
		do
		{
			if(!sc.hasNextInt()) {
				sc.next();
			}
			n = sc.nextInt();
		} while(n % 2 != 0);
		
		int[][] a = new int[n][n];
		
		for(i = 0; i < a.length; i++) {
			c = 0;
			for(j = 0; j < a[i].length - k; j++) {
				a[i][j] = k + 1 + c;
				c++;
			}
			k++;
		}
		
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			System.out.println();
		}


	}

}
