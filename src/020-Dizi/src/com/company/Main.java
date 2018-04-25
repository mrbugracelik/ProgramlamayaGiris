package com.company;


public class Main {

    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9 ,21, 20, 5, 17};
        int size = 10;
        int sum = 0, avg = 0, count = 0;

        for (int i = 0; i < size; i++)
            if (a[i] % 2 != 0) {
                System.out.println("Dizin tek elemani:" + a[i]);
                count = count + 1;
                sum = sum + a[i];
                avg = sum / size;
            }
        System.out.println("Dizideki tek eleman adedi:" + count);
        System.out.println("Dizideki tek elemanlarin toplami:" + sum);
        System.out.println("Dizideki tek elemanlarin ortalamasi:" + avg);

        }
    }

