package buoi4;

import java.util.Scanner;

public class HamisLeapYear {
	public static boolean isLeapYear(int year) {
		boolean check;
		if ((year % 4 == 0 && year % 100 != 0)||year % 400 == 0) {
			return true;
		}
			return false;
			
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean check;
		System.out.println("Nhap nam can kiem tra:");
		int n = input.nextInt();
		if(isLeapYear(n) == true) {
			System.out.println("true");
		} else
			System.out.println("false");
		
	}

}
