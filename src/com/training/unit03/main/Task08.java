package com.training.unit03.main;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		
		int [] [] mas = new int [6] [6];
		
		for (int i = 0; i < mas.length; i ++) {
			for (int j = 0; j < mas [i].length; j ++) {
				mas [i] [j] = rand.nextInt(1000);
				System.out.printf("[%4d]", mas [i] [j]);
			}
			System.out.println();
			
		}
		
		System.out.println("------------------------------------");
		System.out.println("Random string: ");
		
		for(int element: mas[rand.nextInt(6)]) {
			System.out.printf("[%4d]", element);
			
		}
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("Random column: ");
		
		int j = rand.nextInt(mas.length);
		for (int i = 0; i < mas.length; i ++) {
			System.out.printf("[%4d]\n", mas[i][j]);
					
		}								
	
	}

}
