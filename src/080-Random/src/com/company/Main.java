package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

class ScannerSinifi {
    public static void main(String args[]) {
        java.util.Random generator = new java.util.Random();
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, n, b, temp, size = 10;
        for (i = 0; i < size; i++) {
            n = generator.nextInt(10);
            b = generator.nextInt(10);
            temp = a[n];
            a[n] = a[b];
            a[b] = temp;
        }
        for (i = 0; i < size; i++)
            System.out.print(a[i] + " ");
        
    }
}