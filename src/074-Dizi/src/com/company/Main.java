package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

class ScannerSinifi {
	public static void main(String args[]) {
	    int a[] = {1, 1, 1, 3, 5, 5, 8, 9, 17, 17, 17, 17, 20, 24, 24};
	    int size = 15, i, k, n, max = 0, p = 0 ;
	    int count = 0;

	    for (i = 0; i < size; i++){
            for (k = 0; k < size; k++)
                if (a[i] == a[k])
                    count = count + 1;
            if (count > max) {
                max = count;
                p = i;
            }
            count = 0;
        }
        System.out.print(a[p] + " en cok tekrar eden sayidir ve " + max +"'kadar tekrar etmistir");
    }
}

