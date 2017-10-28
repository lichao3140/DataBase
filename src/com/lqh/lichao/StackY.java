package com.lqh.lichao;

public class StackY {
	private int[] stackArray;
	private int maxSize;
	private int top;
	
	public StackY(int s) {
		maxSize = s;
		stackArray = new int[maxSize];
		top = -1;
	}
	
	/**
	 * ѹ������
	 * @param value
	 */
	public void push(int value) {
		stackArray[++top] = value;
	}
	
	/**
	 * ��������
	 * @return
	 */
	public int pop() {
		return stackArray[top--];
	}
	
	/**
	 * �鿴����
	 * @return
	 */
	public int peek() {
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
	public int peekN(int n) {
		return stackArray[n];
	}
	
	public void displayStack(String s) {
		System.out.print(s);
		System.out.print("Stack (bottom-->top):");
		for (int j = 0; j < size(); j++) {
			System.out.print(peekN(j) + " ");
		}
		System.out.println();
	}
}