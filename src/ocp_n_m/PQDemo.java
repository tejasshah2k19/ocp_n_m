package ocp_n_m;

import java.util.PriorityQueue;

public class PQDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(20);
		pq.add(13);
		pq.add(12);
		pq.add(50);
		
		
		System.out.println(pq); //non index 
	
		//service => priority 
		//num -> asc 
		//al -> a - z 
		
		System.out.println(pq.peek()); // front of the queue 
		System.out.println("size => "+pq.size());//4 
		System.out.println(pq.poll()); // front of the queue and remove 
		System.out.println("size => "+pq.size());//4 
		
		
	
	}
}
