package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.Scanner;
public class Main {

    private static Object Scanner;

    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size = 10;
        int i, k, j, n, temp, s, max;
        int po = 0, pe = size - 1;
        int b[] = new int [10];


        max = a[0];
        for (i = 1; i < size; i++)
            if (a[i] > max)
                max = a[i];
        System.out.print("Dizinin en büyük elemani:" + max);
        

    }
}
