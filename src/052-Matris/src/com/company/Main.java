package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int ma[][] = {{5,7,3,},{15,6,10},{22,9,1},{11,14,18}};
        int mb[][] = new int[3][4];
        int i, k;
        int rowA = 4, colA = 3, rowB = 3, colB = 4;

        for ( i = 0; i < rowA; i++)
            for (k = 0; k < colA; k++){
                mb[k][i] = ma[i][k];
            }


        for (i = 0; i < rowB; i++) {
            for (k = 0; k < colB; k++)
                System.out.print(mb[i][k] + " ");
            System.out.println();
        }






    }
}

