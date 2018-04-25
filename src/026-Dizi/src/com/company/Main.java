package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int i, n, k, j;
        int a[] = {4, 8, 3, 1, 18, 9 ,21, 20, 5, 17};
        int size = 10;
        System.out.print("Dizin sondan kaç elemanini istiyorsunuz:");
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();

        for (i = size - n; i < size; i++)
            System.out.println(a[i]);



    }
}