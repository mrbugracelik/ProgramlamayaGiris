package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
class ScannerSinifi {
    public static void main(String args[]) {
        java.util.Random generator = new java.util.Random();
        int a[] = new int[6];
        int i, n = 0, k, c, t;
        int size = 6, count = 0, flag, temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kac tane kupon istediginizi giriniz: ");
        c = input.nextInt();
        for (t = 1; t <= c; t++) {
            //6 farkli sayi üretiliyor...
            count = 0;
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
            //Siralama islemi yapiliyor...
            for (i = 0; i < size - 1; i++)
                for (k = 0; k < size - 1; k++)
                    if (a[k] > a[k + 1]) {
                        temp = a[k];
                        a[k] = a[k + 1];
                        a[k + 1] = temp;
                    }
            System.out.print(t + "'nci kupon: ");
            for (i = 0; i < size; i++)
                System.out.print(a[i] + " ");

            System.out.println();
        }
    }
}