package com.biz.exrc;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.exrc.model.ExecVO;

public class PayMentEx_04 {

	List<ExecVO> payList;
	Scanner scn;
	int intss;
	public PayMentEx_04() {

		payList=new ArrayList<ExecVO>();
		scn=new Scanner(System.in);
	
	}
	
	public void pay() {
		
		
		System.out.print("총급여액>>");
		String stras=scn.nextLine();
		int intas=Integer.valueOf(stras);
		int index=1;
		int pay=50000;
		this.intss=intas;
		ExecVO va=new ExecVO();
		while(pay>5) {
			ExecVO vo=new ExecVO();
			int intpay=(intas/pay);
			vo.setEra(intpay);
			vo.setErr(pay);
			payList.add(vo);
			intas-=(intpay*pay);
			if(index>0) pay=pay/5;
			else pay=pay/2;
			index=index*(-1);
			
		}
	}
	public void payWriter(String fileList) {
		FileWriter fielwriter=null;
		PrintWriter printWriter=null;
		try {
			fielwriter=new FileWriter(fileList);
			printWriter=new PrintWriter(fielwriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printWriter.println("===================================");
		printWriter.printf("%s%d%s\t\n","총급여액 : ",intss,"원");
		printWriter.println("-----------------------------------");
		printWriter.printf("%s\t%s\n","액면가","매수");
		printWriter.println("-----------------------------------");
		for(ExecVO vo: payList) {
			printWriter.printf("%d%s\t%d\n", vo.getErr(),"원권 :",vo.getEra());
		}
		printWriter.flush();
		printWriter.close();
		
	}
}
