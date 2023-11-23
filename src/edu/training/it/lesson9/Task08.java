package edu.training.it.lesson9;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {

		int n = 5;
		int m = 7;
		
		int [][] mas = new int [n][m];
		
		initWithRandom(mas);
		
		System.out.println();
		
		count(mas);
		
	}
		public static void initWithRandom(int mas[][]) {
			
			Random rand = new Random();
			
			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = rand.nextInt(10);
					System.out.printf("[%2d] " , mas[i][j]);
				}
				System.out.println();
		}
	}
		
		public static void count(int [][] mas) {
			
			int count = 0;
			
			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas.length; j++) {
					if(mas[i][j] == 7) {
						count ++;
					}
				}
			}
			System.out.println("Число 7 встречается " + count + " раз(а) ");
		}

}
