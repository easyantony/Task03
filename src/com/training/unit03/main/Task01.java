package com.training.unit03.main;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		//���� ������������������ ����������� ����� �1 , �2 ,..., ��. 
		//������� ������ �� ������ ����� ���� ������������������. 
		//���� ����� ����� ���, �� ������� ��������� �� ���� �����.
        
		int n = 10;
		
		int [] mas = new int [n];
		
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			 mas [i] = rand.nextInt(100);
			 System.out.print("[" + mas[i] + "] ");
		}	 
			 System.out.print("\n������ �� ������ �����: ");
		
		int count = 0;
		for (int i = 0; i < mas.length; i++) {	
			if (mas[i] % 2 == 0) {
				count ++;
			 System.out.print("[" + mas[i] + "] ");
			}						
		}	
		
		if (count == 0) {
			System.out.print("� ������ ������� ���� ������ �����");
		}
	}
}
	


