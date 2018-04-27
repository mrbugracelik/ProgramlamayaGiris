package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.Scanner;
public class Main {

    private static Object Scanner;

    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size = 10;
        int i, k, j, n, temp, s;
        int po = 0, pe = size - 1;
        int b[] = new int [10];

       /* System.out.print("Dizinin kacinci elemanindan baslanicak:");
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();

        System.out.print("Kac eleman ters cevrilicek");
        Scanner  = new Scanner(System.in);
        s = kb.nextInt();
       */

        for (i = 0; i < size; i++)
            if(a[i] % 2 != 0) {
                temp = a[i];
                a[i] = a[po];
                a[po] = temp;
                po = po + 1;
            }

          //Cift olan degerlerLE tekler degistigi icin ciftler icin illa birsey yapmam gerekmiyor


        for (i = 0; i < size; i++)
            System.out.print(a[i] + " ");

    }
}
