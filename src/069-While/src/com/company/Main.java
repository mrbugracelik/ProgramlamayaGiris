package com.company;

import java.util.Scanner;

class ScannerSinifi {
	public static void main(String args[]) {
	    int a, b, sizem = 3, i = 0;
	    int m[] = {1, 2, 3};

        while (i != sizem) {
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen ilk sayiyi giriniz: ");
            a = input.nextInt();

                if (a == m[i])
                    i = i + 1;
                //Girilen deger 1-2-1-olsun 2 den sonra 1 girildigi için else if de ilk degermi diye kontrol ediyoruz...
                else if (a == m[0])
                    i = 1;
                else
                    i = 0;
        }




    }
}

