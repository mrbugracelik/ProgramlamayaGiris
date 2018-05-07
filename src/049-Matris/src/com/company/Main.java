package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int m[][] = new int[19][19];
        int row = 19, col = 19, i, k;

        for (i = 0; i < row; i++) {
            m[i][i] = 1;
            m[i][row - 1 - i] = 1;
            m[i][col / 2] = 1;
            m[row / 2][i] = 1;
        }

        for (i = 0; i < row; i++) {
            for (k = 0; k < row; k++)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }






    }
}

