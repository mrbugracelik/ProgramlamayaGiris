package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.Scanner;
public class Main {

    private static Object Scanner;

    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size = 10;
        int i, k, j, n, temp, s;
        int b[] = new int [10];

        System.out.print("Dizinin kacinci elemanindan baslanicak:");
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();

        System.out.print("Kac eleman ters cevrilicek");
        Scanner  = new Scanner(System.in);
        s = kb.nextInt();


        for (i = 0; i < n / 2 ; i++) {
            temp = a[s + i];
            a[s + i] = a[s + n - 1 - i];
            a[s + n - 1 - i] = temp;
        }
        for (i = 0; i < size; i++)
            System.out.print(a[i] + " ");

    }
}
