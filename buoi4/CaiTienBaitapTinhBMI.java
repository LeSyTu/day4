package buoi4;

import java.util.Scanner;

public class CaiTienBaitapTinhBMI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int check = 0;
		float x, y;
		System.out.println("Vui long  nhap thong tin");
		System.out.println("=============================");
		do {

			System.out.println("Nhap chieu cao:");
			x = input.nextFloat();
			System.out.println("Nhap can nang:");
			y = input.nextFloat();
			float bmi = (float) (y / (x * x));

			if (bmi < 18.5) {
				System.out.println("Thieu can");
			} else if (bmi < 25) {
				System.out.println("Ly tuong");

			} else if (bmi <= 30) {
				System.out.println("Thua can");
			} else {
				System.out.println("Beo phi");
			}
			System.out.println("Ban co muon nhap tiep khong");
			System.out.println("1: Co");
			System.out.println("2: khong");
			check = input.nextInt();

		} while (check == 1);

	}

}
