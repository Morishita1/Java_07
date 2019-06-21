package com.biz.exrc;

public class Exec_05 {

	public static void main(String[] args) {

		String fileList="src/com/biz/exrc/model/급여명세서.txt";
		
		PayMentEx_04 pm=new PayMentEx_04();
		
		pm.pay();
		pm.payWriter(fileList);
		
	}

}
