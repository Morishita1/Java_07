package com.biz.exrc;

import java.util.Random;

public class Exec_02 {

	public static void main(String[] args) {

		/*
		 * 비교판단문
		 * 어떤 결과가 true, false를 판단해서
		 * 코드의 흐름을 변경하는 것
		 * 
		 */
		Random rnd=new Random();
		
		
		while(true) {
		
			int intR=rnd.nextInt(100);
			int intNum=intR%5;
			/*
			 * 
			 */
			switch (intNum) {
			case 0:
				System.out.println("나머지가 0");
				break;
			case 1:
				System.out.println("나머지가 1");
				break;
			case 2:
				System.out.println("나머지가 2");
				break;
			case 3:
				System.out.println("나머지가 3");
				break;
			case 4:
				System.out.println("나머지가 4");
				break;
				
			default:
				break;
			}
			break;
		}
		
		
	}

}
