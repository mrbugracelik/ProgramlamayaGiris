package com.company;

public class Main {

    public static void main(String[] args) {
        //Kullanıcıdan 5 girildigi varsayilsin...
        int i, n, k, j;

        for  (i = 0; i < 5; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" ");
            for (k = 0; k < 5 - i; k++)
                System.out.print("*");
            System.out.println();
        }


    }
}
