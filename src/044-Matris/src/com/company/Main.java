package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int m[][] = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};

        int i, k, row = 4, col = 3, sum = 0, avg = 0, max = 0, min;


        for(i = 0; i < col; i++) {
            max = m[0][i];
            for (k = 0; k < row; k++)
                if (m[k][i] > max)
                    max = m[k][i];
            System.out.println((i + 1) + " 'sütünün en büyük elemani:" + max);
        }








    }
}

