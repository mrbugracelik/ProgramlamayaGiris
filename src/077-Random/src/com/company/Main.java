package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

class ScannerSinifi {
    public static void main(String args[]) {
        int i, odd = 0, n, even = 0;
        java.util.Random generator = new java.util.Random();
        for (i = 0; i < 1000; i++) {
            n = generator.nextInt(10);
            System.out.println(n + " ");
            odd = odd + n % 2;
        }
        even = 1000 - odd;
        System.out.println();
        System.out.println("tekler : " + odd + "  Ciftler:" + even);

    }
}

