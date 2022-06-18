package ghtk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bai2 {
	private static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		System.out.printf("Mời bạn nhập ngày bắt đầu:(dd/MM/yyyy): ");
		String d1 = sc.nextLine();
		
		System.out.printf("Mời bạn nhập ngày kết thúc:(dd/MM/yyyy): ");
		String d2 = sc.nextLine();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date1 = simpleDateFormat.parse(d1);
			Date date2 = simpleDateFormat.parse(d2);
			
			long startValue = date1.getTime();
			long endValue = date2.getTime();
			
			if(endValue > startValue) {
				long temp = Math.abs(startValue - endValue);
				
				long result = temp/(24*60*60*1000);
				
				System.out.println("Số ngày giữa hai mốc thời điểm: " + result);
			}else {
				System.out.println("Mốc thời gian 1 lớn hơn thời gian mốc thời gian 2");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
