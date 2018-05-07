package com.company;

import java.util.Scanner;

class ScannerSinifi {

	public static void main(String args[]){
	int a[] = {5,5,3,7,8,5,7,7,7,3,8,9,8,9,8,8,15,5,8,4};
	int size = 20, n, flag, i, k;
		for (k = 0; k < size; k++){
			flag = 0;
			for (i = 0; i < k; i++)
				if (a[i] == a[k])
					flag = 1;
				if (flag == 1)
					System.out.println("Mevcut...");
				else
					System.out.println("Mevcut değil...");
		}
	}
}
