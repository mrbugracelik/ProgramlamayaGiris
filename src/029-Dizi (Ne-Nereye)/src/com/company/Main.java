package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.Scanner;
public class Main {

    // Bu ÖRNEK İLK NE NEREYE DEGERLERİNİ ÇIKARIP ALGORİTMASİNİ NE NEREYE ŞABLONUNA BAKILARAK YAPILMIŞTIR.
    // Bu Örnek ilk defa problemlere karşı nasıl yanaşmamıza ögreten ilk ögretici problemdir


    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size = 10;
        int i, k, j, n;

        System.out.print("Lütfen bir sayi girin:");
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();


        for (i = 0; i < n; i++)
            a[size - 1 - i] = a[n - 1 - i];
        for (i = 0; i < size - n; i++)
            a[i] = 0;
        for (i = 0; i < size; i++)
            System.out.print(a[i] + " ");



    }
}


