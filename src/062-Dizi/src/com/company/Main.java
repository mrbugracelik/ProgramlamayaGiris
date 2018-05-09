package com.company;

import java.util.Scanner;

class ScannerSinifi {

	public static void main(String args[]) {
		int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
		int i, k, size = 20, flag = 0, count;
		// Birinci fordan if (flag == 0) a kadar olan yer daha önce sayilip sayilmadigini kontrol ediyor...
		for (i = 0; i < size; i++) {
			flag = 0;
			for (k = 0; k < i; k++)
				if (a[i] == a[k])
					flag = 1;
			// Eğer tekrar edilmemişse bu sefer saymaya başliyor..
			//count = 1 den başlamasinin sebebi o sayidan sonrakiler için saymaya başladiği için...
			if (flag == 0) {
				count = 1;
				for (k = i + 1; k < size; k++)
					if (a[i] == a[k])
						count = count + 1;
				System.out.println(a[i] + " : " + count);
			}
		}
	}
}
