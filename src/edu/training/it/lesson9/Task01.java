package edu.training.it.lesson9;

public class Task01 {

	public static void main(String[] args) {

		int [] [] mas = new int [3] [4];
		
		mas[0][0] = 1;
		mas[1][1] = 1;
		mas[2][2] = 1;	
			
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%1d] ", mas[i][j]);
			}
			System.out.println();
		}
	}

}
