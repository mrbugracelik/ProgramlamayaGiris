package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int m[][] = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};

        int i, k, row, col, sum = 0, avg;
        row = 4;
        col = 3;

        for(k = 0; k < col; k++) {
            for (i = 0; i < row; i++)
                sum = sum + m[i][k];
            avg = sum / (row * col);

            System.out.println((k+1) + "'nolu sutunun toplami:" + sum + " - " + "ortalamasi:" + avg);
        }





    }
}

