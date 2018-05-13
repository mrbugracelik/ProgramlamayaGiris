package com.company;

import java.util.Random;
import java.util.Scanner;

class ScannerSinifi {
	public static void main(String args[]) {
	    int a[] = {17, 1, 1, 5, 1, 8, 3, 5, 17, 24, 20, 17, 9, 17, 24, 24};
	    int i, k ,p, size, flag;
	    size = 15;
	    p = 1;
	    for (i = 1; i < size; i++) {
            flag = 0;
            for (k = 0; k < i; k++)
                if (a[i] == a[k])
                    flag = 1;
            if (flag == 0) {
                a[p] = a[i];
                p = p + 1;
            }
        }
        for (i = p; i < size; i++)
            a[i] = 0;
        for (i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}

