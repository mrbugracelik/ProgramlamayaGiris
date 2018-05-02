package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int m[][] = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};

        int i, k, row = 4, col = 3, sum = 0, avg = 0, max;

        // max = 0 diye tanımlasaydik negatif sayilarda program hatali işlem yapicaktir...
       max = m[0][0];

        for(i = 0; i < row; i++)
            for (k = 0; k < col; k++)
                if(m[i][k] > max)
                    max = m[i][k];
        System.out.println("Matrisin en büyük elemani:" + max);







    }
}

