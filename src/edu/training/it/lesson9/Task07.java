package edu.training.it.lesson9;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];

		initWithRandom(mas);

		printArray(mas);

		System.out.println();

		summa(mas);
	}

	public static void initWithRandom(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j] = rand.nextInt(200) - 100;
			}
		}
	}

	public static void printArray(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				System.out.printf("[%5d] ", mas[i][j]);
			}
			System.out.println();

		}
	}

	public static void summa(int[][] mas) {

		int summa = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					summa += Math.abs(mas[i][j]);
				}
			}
		}
		System.out.println("Сумма модулей отрицательных нечетных элементов = " + summa);
	}
}
