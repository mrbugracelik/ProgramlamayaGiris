
package com.company;



public class Main {

    public static void main(String[] args) {
        int m[][] = new int [4][3];
        int row = 4;
        int col = 3;

        for (int i = 0; i < row; i++)
            for ( int k = 0; k < col; k++)
                m[i][k] = 7;
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }
    }
}