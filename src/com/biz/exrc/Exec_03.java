package com.biz.exrc;

import java.util.Scanner;

public class Exec_03 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("해당 년도를 입력하십시오");

		String strYe = scn.nextLine();
		int intYe = Integer.valueOf(strYe);
	
		if(intYe%4==0) {
			//System.out.println(intYe+"1후보");
			if(intYe%100!=0||intYe % 400 == 0) {
				//System.out.println(intYe+"2차후보");
				System.out.println(intYe+"은 윤년 입니다");
			}
		}else {
			System.out.println(intYe + "은 윤년이 아닙니다");
		}
		
		if(intYe%4==0) {
			if(intYe%4==0&&intYe%100!=0) {
				
			}else if(intYe%4==0&&intYe%400==0) {
				System.out.println(intYe+"은 윤년 입니다");
			}
		}else {
			System.out.println(intYe + "은 윤년이 아닙니다");
		}
		
		if(intYe % 4 == 0) {
			if(intYe % 100 != 0&&intYe % 400 == 0 ) {
				
			} else {
				System.out.println(intYe + "은 윤년 입니다");
			}
		}else {
			System.out.println(intYe + "은 윤년이 아닙니다");
		}
		
		if (intYe % 4 == 0&& intYe % 100 != 0||intYe % 400 == 0 ) {
					System.out.println(intYe + "은 윤년 입니다");

		} else {
			System.out.println(intYe + "은 윤년이 아닙니다");
		}

	}

}
