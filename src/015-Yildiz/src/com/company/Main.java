package com.company;

public class Main {

    public static void main(String[] args) {
        //Kullanıcıdan 5 girildigi varsayilsin...
        int i, n, k, j;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++)
                System.out.print(" ");
            for (k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }




    }
}