package com.training.unit03.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		//Дана последовательность чисел а1 ,а2 ,..., ап. 
		//Указать наименьшую длину числовой оси, содержащую все эти числа.
		
		int a = 15;
		
		int [] mas = new int [a];
		
		Random rand = new Random();
		
		int max;
		int min;
		int os;
		
		for(int i = 0; i < mas.length; i++) {
			mas [i] = rand.nextInt(100);
			System.out.print("["+ mas [i] + "] ");
			}
		max = mas [0];
		for(int i = 0; i < mas.length; i++) {
			if (max <= mas [i]) {
				max = mas [i];
			}
		}
		min = mas [0];
		for(int i = 0; i < mas.length; i++) {
			if (min >= mas [i]) {
				min = mas [i];
			}
		}
		
		os = max - min;
		System.out.print("\nМаксимальное = [" + max + "]\nМинимальное  = [" + min + "]");
		System.out.print("\nНаименьшая длина числовой оси данного массива = [" + os + "]");
		
	}
}	
		
		
		
		
		

	


