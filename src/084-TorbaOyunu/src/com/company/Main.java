package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
class ScannerSinifi {
    public static void main(String args[]) {
        java.util.Random generator = new java.util.Random();
        int a[] = new int[3];
        int i, k, size, n, count, flag;
        double win, total, ratio =0;
        win = 0; total = 10000; size = 3;
        total = 10000;
        size = 3;
        for (k = 0; k < total; k++) {
            count = 0;
            while (count != size) {
                n = generator.nextInt(90) + 1;
                flag = 0;
                for (i = 0; i < count; i++)
                    if (a[i] == n)
                        flag = 1;
                if (flag == 0) {
                    a[count] = n;
                    count++;
                }
            }
            if (a[0] + a[1] + a[2] <= 101)
                win = win + 1;
        }
        ratio = win / total;
        System.out.printf("Kazanma olasiligi:" + ratio);
    }
}
