package com.training.unit03.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		//��� ������ �������������� �����, ����������� �������� N. 
		//����������, ������� � ��� �������������, ������������� � ������� ���������.
		
		Random rand = new Random();
		
		int a = rand.nextInt(10)+1;
		
		int [] mas = new int [a];
		
				
		for(int i = 0; i < mas.length; i++) {
			mas [i] = (int)(Math.random()*(200)) - 100;
			System.out.print("["+ mas [i] + "] ");
		}
		
		int zero = 0;
		for(int i = 0; i < mas.length; i++) {
			if (mas [i] == zero) {
			zero ++;
			}
		}
		
		int neg = 0;
		for(int i = 0; i < mas.length; i++) {
			if (mas [i] < neg) {
			neg ++;
			}
		}
		
		int pos = 0;
		for(int i = 0; i < mas.length; i++) {
			if (mas [i] > pos) {
			pos ++;
			}
		}
	System.out.print("\n� ������ ������� ���������� ������������� ����� = " + pos +"\n"
			          +"                            ������������� ����� = " + neg +"\n"
			          +"                            �������   ��������� = " + zero);
	}
}
