
package com.company;



public class Main {

    public static void main(String[] args) {
        int m[][] = new int [4][3];
        int row = 4;
        int col = 3;
        int count = 1;
        for (int i = 0; i < col; i++) {
            for (int k = 0; k < row; k++)
                m[k][i] = count;
            count = count + 1;
        }
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }
    }
}