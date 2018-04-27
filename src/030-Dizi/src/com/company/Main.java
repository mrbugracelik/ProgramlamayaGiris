package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size = 10;
        int i, k, j, n, temp;
        

        temp = a[0]  ;

        for (i = 1; i < size; i++)
            a[i - 1] = a[i];

        a[size- 1] = temp;

        for (i = 0; i < size; i++)
            System.out.print(a[i] + " ");



    }
}


