package com.lqh.lichao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostfixApp {

	public static void main(String[] args) throws IOException {
		String input;
		int output;
		InToPost itp;
		while (true) {
			System.out.print("Enter infix:");
			System.out.flush();
			input = getString();
			if (input.equals("")) break;
			itp = new InToPost(input);
			input = itp.doTrans();//中缀表达式变后缀
			System.out.println("转换后的后缀表达式:" + input);
			ParsePost pp =new ParsePost(input);
			output = pp.doParse();
			System.out.println("Evaluates to:" + output);
		}

	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		return str;		
	}
}
