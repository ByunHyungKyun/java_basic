package i_api;

import java.util.Arrays;
import java.util.Scanner;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요 
		//1234567==>1,234,567
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하시오: ");
		String num=sc.nextLine();
		String[] num2=new String[num.length()];
		int length = num.length();
		
		for (int i = length - 1; i >= 0; i--) {
			String a = num.valueOf(num.charAt(i));
			if (length % 3 == 1) {
				if (i == length - 1) {
					num2[i] = a;
				} else if (i % 3 == 0) {
					a += ",";
					num2[i] = a;
				} else {
					num2[i] = a;
				}
			} else if (length % 3 == 2) {
				if (i == 1) {
					a += ",";
					num2[i] = a;
				} else if (i == length - 1) {
					num2[i] = a;
				} else if (i % 3 == 1) {
					a += ",";
					num2[i] = a;
				} else {
					num2[i] = a;
				}
			} else if (length % 3 == 0) {
				if (i == 2) {
					a += ",";
					num2[i] = a;
				} else if (i == length - 1) {
					num2[i] = a;
				} else if (i % 3 == 2) {
					a += ",";
					num2[i] = a;
				} else {
					num2[i] = a;
				}
			}
			num2[i] = a;
		}
		String rev = "";
		for (int j = 0; j < length; j++) {
			rev += num2[j];
		}
		System.out.println(rev);
*/
		//선생님 코드 
		System.out.print("숫자를 입력해주세요 ");
		String number = ScanUtil.nextLine();
		String number2 = "";
		int count = 0;
		for (int i = number.length() - 1; i >= 0; i--) {
			number2 = number.charAt(i) + number2;
			count++;
			if (count % 3 == 0 && count != number.length()) {
				number2 = "," + number2;
			}
		}
		System.out.print(number2);
	
	}

}
