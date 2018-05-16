package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

class ScannerSinifi {
	public static void main(String args[]) {
	    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	    int i, k, size, mindif, tempdif = 0, n, avg = 0, sum = 0;
	    size = 10;

	    for (i = 0; i < size; i++)
	        sum = sum + a[i];
	    avg = sum / size;
	    mindif = avg - a[0];
	    n = a[0];
	    if (mindif < 0)
	        mindif = -1 * mindif;
	    for (i = 1; i < size; i++) {
            tempdif = avg - a[i];
            if (tempdif < 0)
                tempdif = -1 * tempdif;
            if (tempdif < mindif) {
                mindif = tempdif;
                n = a[i];
            }
        }

        System.out.println("Dizinin ortalamasi:" + avg);
        System.out.println("Ortalamaya en yakin sayi : " + n);
    }
}

