package com.company;

import java.util.Scanner;

class ScannerSinifi {

	public static void main(String args[]){
	int a[] = {5,5,3,7,8,5,7,7,7,3,8,9,8,9,8,8,15,5,8,4};
	int size = 20, n, count = 0, i;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen ilk sayiyi giriniz: ");
		n = input.nextInt();
		for (i = 0; i < size; i++)
			if (a[i] == n)
				count = count + 1;
		System.out.println(n + "'den dizide " + count + " adet var.");

	}
}
