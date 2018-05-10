package com.company;

import java.util.Scanner;

class ScannerSinifi {

	public static void main(String args[]) {
	    /* Bu benim yazdigim algoritma
	     int a, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen ilk sayiyi giriniz: ");
		sum = input.nextInt();

		while (sum <= 1000) {
			System.out.print("Lütfen ilk sayiyi giriniz: ");
			a = input.nextInt();
			sum = sum + a;
		}
        System.out.println(sum);
    */
        int a, sum = 0;
        while (sum <= 1000){
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen sayiyi giriniz: ");
            a = input.nextInt();
            sum = sum + a;
        }
        System.out.println("Toplam : " + sum);




	}
}

