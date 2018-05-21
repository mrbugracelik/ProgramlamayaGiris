package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

class ScannerSinifi {
    public static void main(String args[]) {
        java.util.Random generator = new java.util.Random();
        int a[] = new int[6];
        int i, n = 0;
        int size = 6, count = 0, flag;
        while (count != size) {
            n = generator.nextInt(10);
            flag = 0;
            for (i = 0; i < count; i++)
                if (a[i] == n)
                    flag = 1;
            if (flag == 0) {
                a[count] = n;
                count++;
            }
        }
        for (i = 0; i < size; i++)
            System.out.print(a[i] + "  ");
    }
}