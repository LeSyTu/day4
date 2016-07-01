package buoi4;

import java.util.Scanner;

public class XayHamHoanvi {

	public static void swap(int x, int y) {
		int t = x;
		x = y;
		y = t;
		System.out.println(" x = " + x + " y = " + y);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap 2 so nguyen:");
		System.out.println("So nguyen 1:");
		int number1 = input.nextInt();
		System.out.println("So nguyen 2:");
		int number2 = input.nextInt();

		System.out.println(" x = " + number1 + " y = " + number2);
		swap(number1, number2);

	}

}
