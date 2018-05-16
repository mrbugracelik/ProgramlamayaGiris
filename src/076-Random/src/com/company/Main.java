package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

class ScannerSinifi {
    public static void main(String args[]) {
        int n, i;
        java.util.Random generator = new java.util.Random();

        for (i = 0; i < 1000; i++) {
            n = generator.nextInt(10);
            System.out.print(n + " ");
        }

    }
}

