package com.company;

import java.util.Scanner;

class ScannerSinifi {

	public static void main(String args[]) {
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen ilk sayiyi giriniz: ");
		a = input.nextInt();

		while (a != 0) {
			System.out.print("Lütfen ilk sayiyi giriniz: ");
			a = input.nextInt();
		}

	}
}

