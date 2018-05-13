package com.company;

import java.util.Random;
import java.util.Scanner;

class ScannerSinifi {
	public static void main(String args[]) {
	    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	    int b[] = {8, 13, 6, 12, 4, 5, 19, 1, 14, 25};
	    int i, k, size, flag;
	    size = 10;
	    for (i = 0; i < size; i++)
            System.out.print(a[i] + " ");
	    for (i = 0; i < size; i++) {
            flag = 0;
            for (k = 0; k < size; k++)
                if (b[i] == a[k])
                    flag = 1;
            if (flag == 0)
                System.out.print(b[i] + " ");
        }





    }
}

