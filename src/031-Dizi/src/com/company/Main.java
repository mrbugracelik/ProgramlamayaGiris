package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size = 10;
        int i, k, j, n, temp;
        int b[] = new int [10];
        /*
        System.out.print("Lütfen bir sayi girin:");
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        */



        for (i = 0; i < size ; i++)
            b[size - 1 - i] = a[i];

        for (i = 0; i < size; i++)
            System.out.print(b[i] + " ");



    }
}


