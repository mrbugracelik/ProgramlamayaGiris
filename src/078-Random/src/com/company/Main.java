package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

class ScannerSinifi {
    public static void main(String args[]) {
        int a, b, i, temp, size = 10, count = 0;
        java.util.Random generator = new java.util.Random();
        int m[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int n[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        for (i = 0; i < 1000; i++) {
            a = generator.nextInt(10);
            b = generator.nextInt(10);
            temp = m[b];
            m[b] = m[a];
            m[a] = temp;
        }
        for (i = 0; i < size; i++)
            if (n[i] == m[i])
                count++;
        for (i = 0; i < size; i++)
            System.out.print(m[i] + " ");
        System.out.print( count + "'tane eleman ayni yerinde duruyor");
    }
}

