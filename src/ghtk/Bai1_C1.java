package ghtk;

import java.util.Scanner;

public class Bai1_C1 {
	
	private static Scanner sc = new Scanner(System.in);

	enum Month {
		THANG1(31), THANG3(31), THANG5(31), THANG7(31), THANG8(31), THANG10(31), THANG12(31), THANG4(30), THANG6(30),
		THANG9(30), THANG11(30), THANG2(28);

		int value;

		private Month(int value) {
			this.value = value;
		}
	}

	public static int day() {
		int month;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.printf("Nhap thang: ");
			month = sc.nextInt();
		} while (month < 1 || month > 12);
		
		Month m = Month.values()[month - 1];
		switch (m) {
			case THANG1,THANG3,THANG5,THANG7,THANG8,THANG10,THANG12:
				return m.value;
			case THANG4,THANG6,THANG9:
				return m.value;
			case THANG2:
				return m.value;
			default:
				throw new IllegalArgumentException("Unexpected value: " + m);
		}
	}

	public static void main(String[] args) {
		System.out.println("So ngay trong thang: " + day());
		
	}

}
