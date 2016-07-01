package buoi4;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n;
		int dem  = 0;
		int sum = 0;
		float avg = 0;
		System.out.println("nhap  mot so nguyen bat ky:");
		do{
		n = input.nextInt();
		dem++;
		sum+= n;
		avg = (float) sum/dem; 
		
		}while(n!=0);
		
		
		
		System.out.println("tong cac so nguyen vua nhap:"+sum);
		System.out.println("Trung binh cong cac so nguyen vua nhap"+avg);
}
}
