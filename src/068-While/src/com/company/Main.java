package com.company;

import java.util.Scanner;

class ScannerSinifi {
	public static void main(String args[]) {

	    int a, digit = 0, count = 0, i, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ilk sayiyi giriniz: ");
        a = input.nextInt();
        b = a;
        // Kaç basamakli oldugunu buluyorum...
        while (b != 0) {
            digit = b % 10;
            count = count + 1;
            b = b / 10;
        }
        //Basamak sayisina baglı olarak dizi olusturuyorum...
        int m[] = new int [count];
        for (i = 0; i < count; i++) {
            m[i] = a % 10;
            a = a / 10;
        }
        for (i = count-1 ; i >= 0; i--)
            System.out.print(m[i] + " ");
        
    }
}

