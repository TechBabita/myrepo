package com.practice;

import java.util.Scanner;

public class CubeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 1000:-");
		int number = scanner.nextInt();

		if (number == 1 || number <= 1000) {
			int cube = cubeCul(number);
			System.out.println("cube of " + number + " is :" + cube);

		} else {
			System.out.println("Enter valid number");
		}
		scanner.close();
	}

	private static int cubeCul(int num) {
		return num * num * num;
	}
}
