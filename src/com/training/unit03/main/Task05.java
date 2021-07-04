package com.training.unit03.main;

import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		
		int [] mas = new int [10];
		
		System.out.print("Массив:                ");
		
		for (int i = 0;i < mas.length;i ++) {
			mas [i] = rand.nextInt(1000);
			System.out.print("[" + mas [i] + "]");
		}
		
		System.out.println();
		
		System.out.print("Отсортированный массив: ");
		
		int j, temp;
		for (int i = 0; i < mas.length; i++) {
			temp = mas[i];
			for(j = i - 1; j >= 0 && mas[j] > temp; j--) {
				mas[j + 1] = mas[j];
			}
			mas[j + 1] = temp;
		}
		
		
	    	for (int i = 0; i < mas.length; i ++) {
	    	System.out.print("[" + mas [i] + "]");
	    	}
	}					
}

