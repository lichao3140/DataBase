package com.lqh.lichao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 栈
 * @author Administrator
 *
 */
public class StackApp {

	public static void main(String[] args) throws IOException {		
		String input, output;
		while(true) {
			System.out.println("Please input a String:");
			System.out.flush();
			input =getString();
			if(input.equals(""))
				break;
			//Reverser reverser = new Reverser(input);//在此调用Reverser，因此Reverser必须为static
			//output = reverser.doRev();
			//System.out.println("Reverser:" + output);
			
			//StringBuffer里面的reverse反转方法
			//StringBuffer sb = new StringBuffer("中华人民共和国");
			//System.out.println("StringBuffer reverse:" + sb.reverse());
			
			BracketChecker bracket = new BracketChecker(input);
			bracket.check();
		}
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	//字符串反转
	static class Reverser {
		private String input;
		private String output;
		
		public Reverser(String in) {
			input = in;
		}
		
		/**
		 * 字符串反转
		 * @return
		 */
		public String doRev() {
			int stackSize = input.length();
			StackX stack = new StackX(stackSize);
			for(int j = 0; j < stackSize; j++) {
				char ch =input.charAt(j);
				stack.push(ch);
			}
			output = "";
			while(!stack.isEmpty()) {
				char c = stack.pop();
				output = output + c;
			}
			return output;
		}
	}
	
	//括号检查
	static class BracketChecker {
		private String input;
		
		public BracketChecker(String in) {
			input = in;
		}
		
		/**
		 * 输入的括号要匹配成对，如{([{}])}
		 */
		public void check() {
			int stackSize = input.length();
			StackX stack = new StackX(stackSize);
			for(int j = 0; j < stackSize; j++) {
				char ch = input.charAt(j);
				switch(ch) {
				case '{':
				case '(':
				case '[':
					stack.push(ch);
					break;
				case '}':
				case ')':
				case ']':
					if(!stack.isEmpty()) {
						char chx = stack.pop();
						if((ch=='{' && chx!='}') || (ch=='(' && chx!=')') || (ch=='[' && chx!=']')) {
							//如果括号不匹配，就错误
							System.out.println("Error:" + ch + "at" + j);
						}
					} else {
						System.out.println("Error:" + ch + "at" + j);
					}
					break;
				default:
					break;
				}
			}
			if(!stack.isEmpty())
				System.out.println("Error: missing right delimiter.");
		}
	}
}
