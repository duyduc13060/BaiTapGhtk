package ghtk;

import java.util.Scanner;

public class Bai3 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;

		System.out.printf("Nhập Số n: ");
		n = sc.nextInt();
		
		
		System.out.println("Tổng các số nguyên tố: " + tinhTongDoWhitle(n));
//		System.out.println("Tổng các số nguyên tố: " + tinhTongFor(n));
//		System.out.println("Tổng các số nguyên tố: " + tinhTongWhile(n));

	}

// dùng vong lặp for	
	public static int tinhTongFor(int n) {
		int tong = 0;
		for (int i = 1; i < n; i++) {
			if (kiemTra(i) == 1) {
				tong += i;
			}
		}
		return tong;
	}

// dung vong lặp while
	public static int tinhTongWhile(int n) {
		int tong = 0;
		int i = 1;
		while (i < n) {
			if (kiemTra(i) == 1) {
				tong += i;
			}
			i++;
		}
		return tong;
	}

// dung vong do while 
	public static int tinhTongDoWhitle(int n) {
		int tong = 0;
		int i = 1;
		do {
			if (kiemTra(i) == 1) {
				tong += i;
			}
			i++;
		} while (i < n);

		return tong;
	}

	public static int kiemTra(int n) {
		int dem = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				dem++;
			}
		}
		if (dem == 2) {
			return 1;
		} else
			return 0;
	}

}
