package com.lqh.lichao;

/**
 * ╤сап
 * @author Administrator
 *
 */
public class QueueApp {

	public static void main(String[] args) {
		Queue queue = new Queue(10);
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		queue.insert(50);
		while(!queue.isEmpty()) {
			System.out.println("Delete:" + queue.remove());
		}
		
	}

}
