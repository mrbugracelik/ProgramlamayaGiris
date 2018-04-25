package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int i, n, k, j, s;
        int a[] = {4, 8, 3, 1, 18, 9 ,21, 20, 5, 17};
        int size = 10;
        System.out.print("Dizinin kacinci indisinden baslansin:");
        Scanner kb = new Scanner(System.in);
        s = kb.nextInt();
        System.out.print("Kac eleman istiyorsunuz:");
        n = kb.nextInt();

        for (i = s; i < s + n ; i++)
            System.out.println(a[i]);



    }
}