package buoi4;

import java.util.Scanner;

public class Day4_muc13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap do rong mang:");
		int n = input.nextInt();
		int arrInt[] = new int[100];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1) + ":");
			arrInt[i] = input.nextInt();
		}
		System.out.println("Cac phan tu trong mang: ");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arrInt[i]);
		}
		System.out.println();
		int max = arrInt[0];
		int isMax = 0;
		int min = arrInt[0];
		int isMin = 0;
		for (int i = 0; i < n; i++) {

			if (arrInt[i] > max) {
				max = arrInt[i];
				isMax = i;
			}
			if (arrInt[i] < min) {
				min = arrInt[i];
				isMin = i;
			}

		}
		System.out.println("Phan tu lon nhat: " + max + "      Chi so:" + isMax);
		System.out.println("Phan tu nho nhat: " + min + "      Chi so:" + isMin);

	}

}
