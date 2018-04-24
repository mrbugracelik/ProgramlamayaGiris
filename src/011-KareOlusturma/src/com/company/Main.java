package com.company;

public class Main {

    public static void main(String[] args) {
	int i;
	int n, k;

	for (i = 1; i <= 6; i++){
	    if (i == 1)
	        for(k=1; k <= 6; k++)
                	System.out.print("*");
	    else if (i == 6)
            	for(k=1; k <= 6; k++)
               		System.out.print("*");
	    else {
            	System.out.print("*");

            for (k = 1; k <= 6 - 2; k++)
                System.out.print(" ");

            System.out.print("*");
        }
        System.out.println();
	}
    }
}
