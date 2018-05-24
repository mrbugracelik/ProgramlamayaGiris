package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
class ScannerSinifi {
    public static void main(String args[]) {
        java.util.Random generator = new java.util.Random();
        int i, j, k;
        double win, total, ratio;
        win = 0;
        total = 0;
        for (i = 1; i <= 90; i++)
            for (j = i + 1; j <= 90; j++)
                for (k = j + 1; j <= 90; j++) {
                    if (i + j + k <= 101)
                        win = win + 1;
                    total = total + 1;
                }
        ratio = win / total;
        System.out.println("Kazanma olasiligi:" + ratio);

    }
}
