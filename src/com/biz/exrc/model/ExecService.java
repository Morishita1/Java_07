package com.biz.exrc.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ExecService {

	List<Integer> yearList;

	public ExecService() {

		yearList = new ArrayList<Integer>();

	}

	public void makeyearList(int startYear, int endYear) {
		for (int year = startYear; year <= endYear; year++) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				yearList.add(year);
			}
		}
		System.out.println("윤년 개수 : "+ yearList.size());
		System.out.println();
	}
	public void YearWriter(String leapFileName) {
		FileWriter fileWriter=null;
		PrintWriter printWriter=null;
		
		try {
			fileWriter= new FileWriter(leapFileName);
			printWriter= new PrintWriter(fileWriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int year : yearList) {
			printWriter.println(year+"년");
		}
		printWriter.flush();
		printWriter.close();
		System.out.println("저장 완료");
	}
}
