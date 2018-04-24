
package com.company;



public class Main {

    public static void main(String[] args) {
        int m[][] = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
        int row = 4;
        int col = 3;
        int toplam = 0, average = 0;
        for (int i = 0; i < row; i++)
            for (int k = 0; k < col; k++)
                toplam = toplam + m[i][k];
        average = toplam / (row * col);
        System.out.println("Dizinin toplami" + toplam);
        System.out.println("Dizinin ortalamasi" + average);
    }
}