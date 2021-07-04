package com.training.unit03.main;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		//Дана квадратная матрица. Вывести на экран элементы, 
		//стоящие на диагонали.
		
		int [] [] array = new int [5] [5];
		
		Random rand = new Random();
		
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j++) {
				array [i] [j] = rand.nextInt(1000);
				System.out.printf("[%4d]", array [i] [j]);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j++) {				
			}
			System.out.printf("[%4d]", array [i] [i]);
		
		}

	}

}
