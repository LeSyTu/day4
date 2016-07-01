package buoi4;

import java.util.Scanner;

public class KiemtraChuoiDoixung {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("nhap voa 1 chuoi");
		String str = input.nextLine();
		
		char[] array;
		int check = 0;
		array = str.toCharArray();		
		for(int i = 0; i < array.length/2; i++) {
			if(array[i] == array[array.length-i-1]) {
				check = 0;
				
			} else check = 1;
		}
		if(check == 0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
