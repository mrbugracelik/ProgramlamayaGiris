package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int m[][] = new int[5][5];
        int row = 5, col = 5, i, k, count = 1;

        for ( i = 0; i < row; i++)
            for (k = col - i - 1; k < col; k++){
                m[i][k] = count;
                count++;
            }


        for (i = 0; i < row; i++) {
            for (k = 0; k < row; k++)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }






    }
}

