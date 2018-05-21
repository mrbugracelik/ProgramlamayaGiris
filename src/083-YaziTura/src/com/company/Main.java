package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
class ScannerSinifi {
    public static void main(String args[]) {
        java.util.Random generator = new java.util.Random();
        // 1 TURA OLSUN 0 YAZI ARALARAK KABUL EDELIM
        int i, n, size, tail;
        size = 1000000;
        int head = 0;
        for (i = 0; i < size; i++) {
            n = generator.nextInt(2);
            head = head + n;
        }
        tail = size - head;
        System.out.println("Tura gelme sayisi:" + head);
        System.out.print("Yazi gelme sayisi:" + tail);
    }
}