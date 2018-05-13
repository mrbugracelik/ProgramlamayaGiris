package com.company;

import java.util.Random;
import java.util.Scanner;

class ScannerSinifi {
	public static void main(String args[]) {
	    int a[] = {1, 1, 1, 3, 5, 5, 8, 9, 17, 17, 17, 17, 20, 24, 24};
	    int i, k ,p, size;
	    size = 15;
	    p = 1;
	    for (i = 1; i < size; i++)
	        if (a[i] != a[i - 1] ) {
                a[p] = a[i];
                p = p + 1;
            }
        for (i = p; i < size; i++)
            a[i] = 0;
        for (i = 0; i < size; i++)
            System.out.print(a[i] + " ");

    }
}

