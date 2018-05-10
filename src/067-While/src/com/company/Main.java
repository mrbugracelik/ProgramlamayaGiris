package com.company;

import java.util.Scanner;

class ScannerSinifi {
	public static void main(String args[]) {

	    int a, digit = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ilk sayiyi giriniz: ");
        a = input.nextInt();
        while (a != 0) {
            digit = a % 10;
            System.out.print(digit + " ");
            a = a / 10;
        }

    }
}

