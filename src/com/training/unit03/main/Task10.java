package com.training.unit03.main;

public class Task10 {

	public static void main(String[] args) {
//—формировать квадратную матрицу пор€дка n по заданному образцу(n -четное)
		
		int n = 6;
		int [] [] mas = new int [n] [n];
		
		int b = 1;
		
		for (int i = 0; i < mas.length; i++) {
			for(int j = 0; j < mas.length; j++) {
				if(i == 0 || j == 0 || j == 5 || i == 5) {
					mas [i] [j] = b;
					
				}else{
					mas [i] [j] = 0;
				}
				System.out.printf("[%4d]", mas [i] [j]);
			}
			System.out.println();
		}

	}

}
