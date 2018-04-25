package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Kullanıcıdan 5 girildigi varsayilsin...
	int i, n, k, j;
	Scanner kb = new Scanner(System.in);
	n = kb.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }




    }
}