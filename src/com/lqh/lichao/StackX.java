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
	
	/**
	 * 查看长度
	 * @return
	 */
	public int size() {
		return top + 1;
	}
	
	/**
	 * 查看一个数据
	 * @param n
	 * @return
	 */
	public char peekN(int n) {
		return stackArray[n];
	}
	
	public void displayStack(String s) {
		System.out.print(s);
		System.out.print("Stack (bootom-->top):");
		for (int j = 0; j < size(); j++) {
			System.out.print(peekN(j) + " ");
		}
		System.out.println();
	}
}
