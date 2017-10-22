package com.lqh.lichao;

/**
 * 栈
 * @author Administrator
 *
 */
public class StackX {
	private char[] stackArray;
	private int maxSize;
	private int top;
	
	public StackX(int s) {
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	/**
	 * 压入数据
	 * @param value
	 */
	public void push(char value) {
		stackArray[++top] = value;
	}
	
	/**
	 * 弹出数据
	 * @return
	 */
	public char pop() {
		return stackArray[top--];
	}
	
	/**
	 * 查看数据
	 * @return
	 */
	public char peek() {
		return stackArray[top];
	}
	
	/**
	 * 是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return top == -1;
	}
	
	/**
	 * 是否满了
	 * @return
	 */
	public boolean isFull() {
		return top == (maxSize - 1);
	}
}
