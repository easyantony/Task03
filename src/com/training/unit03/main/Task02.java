package com.training.unit03.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		//���� ������������������ ����� �1 ,�2 ,..., ��. 
		//������� ���������� ����� �������� ���, ���������� ��� ��� �����.
		
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
		System.out.print("\n������������ = [" + max + "]\n�����������  = [" + min + "]");
		System.out.print("\n���������� ����� �������� ��� ������� ������� = [" + os + "]");
		
	}
}	
		
		
		
		
		

	


