package com.company;


public class Main {

    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9 ,21, 20, 5, 17};
        int size = 10;
        int sum = 0, avg, count = 0;

        for (int i = 0; i < size; i++) //Burdaki for tüm dizinin elamanlarina ulaşmama yardimci oluyor..
            if (a[i] % 2 != 0){
                System.out.println("Dizin tek elemani:" + a[i]);
                count = count + 1;
            }
        System.out.println("Dizideki tek eleman adedi:" + count);

        }
    }

