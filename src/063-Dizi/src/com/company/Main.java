package com.company;

import java.util.Scanner;

class ScannerSinifi {

	public static void main(String args[]) {
		int a[] = {4,8,3,1,18,9,21,20,5,17};
		int b[] = {8,13,6,12,4,5,19,1,14,25};
		int size = 10, i, k;

		for (i = 0; i < size; i++)
			for (k = 0; k < size; k++)
				if (a[i] == b[k])
					System.out.print(a[i] + "  ");
	}
}

