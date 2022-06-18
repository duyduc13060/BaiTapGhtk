package ghtk;

import java.util.Scanner;

public class Bai1_C2 {
	public static void main(String[] args) {
		int month;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.printf("Nhap thang: ");
			month = sc.nextInt();

		} while (month < 1 || month > 12);
		System.out.println("So ngay trong thang: " + day(month)) ; 
	}
	
	public static int day(int month) {
		switch (month) {
			case 1,3,5,7,8,10,12:
				return 31;
			case 4,6,9,11:
				return 30;
			case 2:
				return 28;
			default:
				throw new IllegalArgumentException("Unexpected value: " + month);
		}
	}
	
}
