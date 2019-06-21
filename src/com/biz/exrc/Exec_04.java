package com.biz.exrc;

import java.io.IOException;

import com.biz.exrc.model.ExecService;

public class Exec_04 {

	public static void main(String[] args) {

		String fileName="src/com/biz/exrc/model/YearList.txt";
		
		ExecService es=new ExecService();
		es.makeyearList(1900, 3000);
			es.YearWriter(fileName);
		
	}

}
