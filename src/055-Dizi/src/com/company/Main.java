package com.company;

public class Main {

    public static void main(String[] args) {
	int a[] = {4,8,-3,-1,18,9,-21,20,5,-17};
	int i = 0, maxNeg = 0, size = 10;

	// İlk negatif sayinin nerede olacagini bilmedigimden while döngüsünü kullaniyoruz...
	while (a[i] >= 0)
        i = i + 1;
	maxNeg = a[i];

	for (i = i + 1; i < size; i++)
	    if (a[i] < 0)
	        if (a[i] > maxNeg)
	            maxNeg = a[i];
        System.out.println(maxNeg);



    }
}
