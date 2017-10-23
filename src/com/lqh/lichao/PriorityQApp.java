package com.lqh.lichao;

public class PriorityQApp {

	public static void main(String[] args) {
		PriorityQ pq = new PriorityQ(10);
		pq.insert(30);
		pq.insert(70);
		pq.insert(40);
		pq.insert(10);
		pq.insert(50);
		while(!pq.isEmpty()) {
			System.out.print(pq.remove() + " ");
		}
	}

}
