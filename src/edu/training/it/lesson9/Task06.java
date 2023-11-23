package edu.training.it.lesson9;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		int[][] mas = new int[4][8];

		initWithRandom(mas);

		printArray(mas);
		
		System.out.println();
		
		printArray2(mas);

	}

	public static void initWithRandom(int mas[][]) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
	}

	public static void printArray(int mas[][]) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d] ", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static void printArray2(int mas[][]) {

		for (int i = 0; i < mas.length; i ++) {
			for (int j = 1; j < mas[i].length; j += 2) {
				if(mas[0][j] > mas[mas.length-1][j]) {
				System.out.printf("[%3d] " , mas[i][j]);
			
		}}
			System.out.println();
		}
		
	
	}
}
