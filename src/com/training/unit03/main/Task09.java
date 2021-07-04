package com.training.unit03.main;

public class Task09 {

	public static void main(String[] args) {
//—формировать квадратную матрицу пор€дка n по заданному образцу(n - четное)
		
		int n = 6;
		int [] [] mas = new int [n] [n];
		
		int b = 1;
				
		for (int i = n-1; i >= 0 ; i--) {
			  mas [i] [i] = b++;
			   for(int j = 0; j < mas.length; j++) {				  				  				  				 				  				 		  		  
				  System.out.printf("[%4d]", mas [i] [j]);		  
			  }
			   System.out.println();
		  }
			  		 								
	}

}
