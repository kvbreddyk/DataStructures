package com.vijay.algorithms.ds.heap;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue<T> {
	
	List<T> heap ;
	
	public PriorityQueue(){
		heap = new ArrayList<T>();
	}
	
	public int size(){
		return heap.size();
	}
	
	public void add(T e){
		
	}
	
	public void remove(T e){
		
	}
	
	public T findMin(){
		if(heap.isEmpty()){return null;}
		return heap.get(0);
	}

}
