package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
        int i, n, k, j, t;

        for ( i = 1; i <= 13; i++) {
            if (i == 1)
                for ( k = 0; k < 10; k++)
                    System.out.print("*");
            else if (i == 7)
                for ( k = 0; k < 10; k++)
                    System.out.print("*");
            else if (i == 13)
                for ( k = 0; k < 10; k++)
                    System.out.print("*");
            else {
                System.out.print("*");
                for ( j = 0; j < 8; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (i = 1; i <= 7; i++) {
            if (i == 7)
                for (t = 1; t <= 7; t++)
                    System.out.print("*");
            System.out.print("*");
            for (j = 1; j <= 5; j++)
                System.out.print(" ");
            System.out.println("*");

        }
        System.out.println();



        for (i = 1; i <= 4; i++) {
            if (i == 1)
                for (t = 1; t <= 7; t++)
                    System.out.print("*");
            System.out.println("*");
        }
        for (i = 1; i <= 5; i++) {
            if (i == 1)
                for (t = 1; t <= 6; t++)
                    System.out.print("*");


            if (i == 4)
                for (t = 1; t <= 6; t++)
                    System.out.print("*");



            else {
                System.out.print("*");
                for (j = 1; j <= 5; j++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();

            }


        }

        System.out.println();


        for(i = 1; i <= 6; i++) {
            if (i == 1)
                for (k = 1; k <= 6; k++)
                    System.out.print("*");
            else if (i == 6)
                for (k = 1; k <= 6; k++)
                    System.out.print("*");
            else {
                System.out.print("*");
                for (k = 1; k <= 6 - 2; k++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 1; i <= 6; i++) {
            System.out.print("*");

            for (k = 1; k <= i - 1; k++)
                System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }
        System.out.println();

        int u = 1;

        for (k = 1; k <= 6; k++)
            System.out.print(" ");
        System.out.println("*");

        for (i = 1; i < 7; i++) {

            if (i == 4) {
                for ( t = 0; t < 2; t++)
                    System.out.print(" ");
                for (k = 1; k <= 9; k++)
                    System.out.print("*");
            }
            else {
                for (k = 1; k <= 6 - i; k++)
                    System.out.print(" ");
                System.out.print("*");

                for (j = 1; j <= u; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            u = u + 2;
            System.out.println();
        }















    }


    }

