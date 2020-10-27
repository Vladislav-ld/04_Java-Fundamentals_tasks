package by.htp.les06.HMA;

import java.util.Scanner;

public class Hm5 {

	public static void main(String[] args) {
		int n;
		int i;
		int j;
		int c;
		
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
		
		j = 0;
		c = n - 1;
		
		for(i = 0; i < a.length; i++) {
			a[j][c] = i + 1;
			j++;
			c--;
		}
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			System.out.println(";");
		}

	}

}
