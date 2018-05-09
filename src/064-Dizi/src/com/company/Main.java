package com.company;

import java.util.Scanner;

class ScannerSinifi {

	public static void main(String args[]) {
		int a[] = {1,5,12,15,19,28,35,46,60,0};
		int size = 10, i, k, n, temp;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen ilk sayiyi giriniz: ");
		n = input.nextInt();
		a[size - 1] = n;
		for (i = size - 2; i >= 0; i--)
			if (a[i] > a[i + 1]){
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
			for (i = 0; i < size; i++)
				System.out.println(a[i]);

	}
}

