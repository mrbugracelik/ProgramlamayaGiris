package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int a[] = {4, 8, 3, 1, 18, 9 ,21, 20, 5, 17};
        int size = 10;
        int sum = 0, avg = 0, count = 0, n, i, k;


        for (i = 0; i < size; i++)
            sum = sum + a[i];
        avg = sum / size;

        for (i = 0; i < size; i++)
            if (a[i] < avg)
                System.out.println(a[i]);

    }
    }

