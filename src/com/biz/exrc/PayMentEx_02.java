package com.biz.exrc;

public class PayMentEx_02 {

	public static void main(String[] args) {
		
		// 총급여액
		int intpay= 3892840;
		
		// 대한민국 액면가 최고 가
		int intMoney=50000;
		
		int count=0;
		while(intpay >5) {
			
			// 매수계산
			int paper=(intpay/intMoney);
			System.out.println(intMoney+"원권 : "+paper);
			
			// 액면가 * 매수만큼 제외
			intpay-=(paper*intMoney);
			if(count++%2==0)	intMoney=intMoney /5;
			else intMoney=intMoney /2;
			
		}

	}

}
