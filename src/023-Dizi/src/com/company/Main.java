package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int a[] = {4, 8, 3, 1, 18, 9 ,21, 20, 5, 17};
        int size = 10;
        int sum = 0, avg = 0, count = 0, n, i, k;
        int toplamtek = 0, counttek = 0, toplamcift = 0, countcift = 0;
        System.out.print("Lütfen bir sayi girin:");
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();

        for (i = 0; i < size; i++)
            if (a[i] < n)
                if (a[i] % 2 != 0) {
                    toplamtek = toplamtek + a[i];
                    counttek++;
                }
                else {
                    toplamcift = toplamcift + a[i];
                    countcift++;
                }

        System.out.println("Teklerin toplami:" + toplamtek);
        System.out.println("Teklerin adedi:" + counttek);
        System.out.println("Ciftlerin toplami:" + toplamcift);
        System.out.println("Ciftlerin adedi:" + countcift);
        
        }
    }

