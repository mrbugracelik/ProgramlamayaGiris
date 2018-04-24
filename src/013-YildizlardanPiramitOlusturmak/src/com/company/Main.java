package com.company;

public class Main {

    public static void main(String[] args) {
        //Kullanıcıdan 9 girildigi varsayilsin...
        int i, n, k, j;

        for (i = 1; i <= (9 + 1); i = i + 2) {
            for (k = 1; k <= (9 - i) / 2; k++)
                System.out.print(" ");
            for (j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }



    }
}