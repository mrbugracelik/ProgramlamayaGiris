package com.company;

public class Main {

    public static void main(String[] args) {
        int i;
        int n, k, j;
        // Kullanıcadan 7 girildigi varsayılıcak...
        for (i = 1; i <= 7; i++) {

            if (i == (7 + 1) / 2)
                for (j = 1; j <= 7; j++)
                    System.out.print("*");
            else {

                for (k = 1; k <= 7 / 2; k++)
                    System.out.print(" ");

                    System.out.print("*");

                for (k = 1; k <= 7 / 2; k++)
                    System.out.print(" ");


            }
            System.out.println();

        }
    }
}