package com.training.unit03.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		//��� ���������� ������ nm ���������. ����������, ������� ��� 
		//����������� ����� 7 ����� ��������� �������.
       
       int [] [] array = new int [5] [5];
       
       Random rand = new Random();
       
       for (int i = 0; i < array.length; i++) {
    	   for (int j = 0; j < array [i].length; j++) {
    		   array [i] [j] = rand.nextInt(10);
    		   System.out.printf("[%4d]", array [i][j]);
    	   }
    	   System.out.println();
       }
       
       int count = 0;
       for (int i = 0; i < array.length; i++) {
    	   for (int j = 0; j < array [i].length; j++) {
    		   if (array[i][j] == 7) {
    			   count++;
    		   }
           }
	
	   }
       System.out.println();
       System.out.print("����� 7 ����������� " + count + " ���(�) ����� ��������� �������.");
	}
}
