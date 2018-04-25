package com.company;


public class Main {

    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9 ,21, 20, 5, 17};
        int size = 10;
        int sum = 0, avg;

        for (int i = 0; i < size; i++)
            sum = sum + a[i];
        avg = sum / size;
        System.out.println("Dizinin ortalamasi:" + avg);
        System.out.print("Dizinin toplami:" + sum);

        }
    }

