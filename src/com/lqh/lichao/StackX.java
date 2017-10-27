package com.lqh.lichao;

/**
 * ջ
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
	 * ѹ������
	 * @param value
	 */
	public void push(char value) {
		stackArray[++top] = value;
	}
	
	/**
	 * ��������
	 * @return
	 */
	public char pop() {
		return stackArray[top--];
	}
	
	/**
	 * �鿴����
	 * @return
	 */
	public char peek() {
		return stackArray[top];
	}
	
	/**
	 * �Ƿ�Ϊ��
	 * @return
	 */
	public boolean isEmpty() {
		return top == -1;
	}
	
	/**
	 * �Ƿ�����
	 * @return
	 */
	public boolean isFull() {
		return top == (maxSize - 1);
	}
	
	/**
	 * �鿴����
	 * @return
	 */
	public int size() {
		return top + 1;
	}
	
	/**
	 * �鿴һ������
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
