package com.company;

public class Main {

    public static void main(String[] args)
    {
	    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	    int i, k, temp=0, size = 10;

	    for (i = 0; i < size / 2; i++) {
            temp = a[i];
            a[i] = a[size - 1 - i];
            a[size - 1 - i] = temp;
        }
        for (i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}
