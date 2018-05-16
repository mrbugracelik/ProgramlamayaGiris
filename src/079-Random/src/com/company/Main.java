package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

class ScannerSinifi {
    public static void main(String args[]) {
        java.util.Random generator = new java.util.Random();
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {4, 8, 3, 1, 18, 9 ,21, 20, 5, 17};
        int i, size, n1, n2, temp, count, countswapp;
        size = 10;
        count = 0;
        countswapp = 0;
        while (count != size){
            countswapp++;
            n1 = generator.nextInt(10);
            n2 = generator.nextInt(10);
            temp = a[n1];
            a[n1] = a[n2];
            a[n2] = temp;
            count  =0 ;
            for (i = 0; i < size; i++)
                if (b[i] == a[i])
                    count++;
        }
        System.out.print("Dizi " + countswapp + " tekrardan sonra eski haline geri dönmüstür...");
    }
}

