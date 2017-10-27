package com.lqh.lichao;

/**
 * 中缀表达式转换成后缀表达式
 * @author Administrator
 *
 */
public class InToPost {

	private StackX stack;
	private String input;//中缀表达式
	private String output = "";//后缀表达式
	
	public InToPost(String in) {
		input = in;
		int stackSize = input.length();
		stack = new StackX(stackSize);
	}
	
	public String doTrans() {
		for(int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			stack.displayStack("For " + ch + " ");
			switch(ch) {
				case '+':
				case '-':
					gotOper(ch, 1);
					break;
				case '*':
				case '/':
					gotOper(ch, 2);
					break;
				case '(':
					stack.push(ch);
					break;
				case ')':
					gotParen(ch);
					break;
			}
		}
		while(!stack.isEmpty()) {
			stack.displayStack("While ");
			output = output + stack.pop();
		}
		stack.displayStack("End ");
		return output;
	}
	

	public void gotOper(char opt, int prec1) {
		while(!stack.isEmpty()) {
			char opTop = stack.pop();
			if(opTop == '(') {
				stack.push(opTop);
				break;
			} else {
				int prec2;
				if(opTop == '+' || opTop == '-')
					prec2 = 1;
				else
					prec2 = 2;
				if (prec2 < prec1) {
					stack.push(opTop);
					break;
				} else {
					output = output + opTop;
				}
			}
		}
		stack.push(opt);
	}
	
	public void gotParen(char ch) {
		while(!stack.isEmpty()) {
			char chx = stack.pop();
			if (chx == '(') {
				break;
			} else {
				output = output + chx;
			}
		}
	}
}
