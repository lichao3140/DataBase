package com.lqh.lichao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 算术表达式
 * @author Administrator
 *
 */
public class InfixApp {

	public static void main(String[] args) throws IOException {
		String input, output;
		while(true) {
			System.out.print("Enter infix:");
			System.out.flush();
			input = getString();
			if (input.equals(""))
				break;
			InToPost itp = new InToPost(input);
			output = itp.doTrans();
			System.out.println("Postfix is " + output);
		}
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		return str;
		
	}

}
