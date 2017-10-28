package com.lqh.lichao;

/**
 * ��׺���ʽ����
 * @author Administrator
 *
 */
public class ParsePost {
	private StackY stack;
	private String input;
	
	public ParsePost(String s) {
		input = s;
	}
	
	public int doParse() {
		stack = new StackY(20);
		char ch;
		int j;
		int num1, num2, interAns;
		for(j = 0; j < input.length(); j++) {
			ch = input.charAt(j);
			stack.displayStack(" " + ch + " ");
			if (ch >= '0' && ch <= '9') {
				stack.push((int)(ch - '0'));
			} else {
				num2 = stack.pop();
				num1 = stack.pop();
				switch(ch) {
				case '+':
					interAns = num1 + num2;
					break;
				case '-':
					interAns = num1 - num2;
					break;
				case '*':
					interAns = num1 * num2;
					break;
				case '/':
					interAns = num1 / num2;
					break;
				default:
					interAns = 0;
					break;
				}
				stack.push(interAns);
			}			
		}
		interAns = stack.pop();
		return interAns;
	}
}
