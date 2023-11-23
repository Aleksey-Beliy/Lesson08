package edu.training.it.lesson9;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {

		Random rand = new Random();

		int[][] mas = new int[2][3];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(9);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}
	}

}
