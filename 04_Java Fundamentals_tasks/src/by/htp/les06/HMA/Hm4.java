package by.htp.les06.HMA;

import java.util.Scanner;

public class Hm4 {

	public static void main(String[] args) {
		int n;
		int i;
		int j;
		int count;
		
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
			if(i  % 2 == 0) {
				count = n;
				for(j = 0; j < a[i].length; j++) {
					a[i][j] = count;
					count--;
				}
			} else {
				count = 1;
				for(j = 0; j < a[i].length; j++) {
					a[i][j] = count;
					count++;
				}
			}
		}
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
			System.out.println(";");
		}
		


	}

}
