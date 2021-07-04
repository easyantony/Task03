package com.training.unit03.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		//Реализовать сортировки выбором или пузырьком по убыванию. 
		
		int [] mas = new int [10];
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length;i++) {
			mas [i] = rand.nextInt(1000);
			System.out.print("[" + mas [i] + "]");
		}
		System.out.println();
		int max,help;
		
		for (int i = 0;i < mas.length;i++) {
			max = i;
			for (int z = i + 1;z < mas.length;z++) {
				if (mas [z] > mas [max]) {
					max = z;
				}
		    }
			help = mas [i];
			mas [i] = mas [max];
			mas [max] = help;
		}
		
		for (int i = 0;i < mas.length;i++) {
			System.out.print("[" + mas[i] + "]");
		}
		

	}

}
