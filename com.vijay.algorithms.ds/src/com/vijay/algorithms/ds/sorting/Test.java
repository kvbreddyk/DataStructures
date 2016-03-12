package com.vijay.algorithms.ds.sorting;

import java.util.Comparator;

public class Test {
	
	static Comparator<Integer> comapre =new  Comparator<Integer>(){
		@Override
		public int compare(Integer o1,Integer o2) {
			return o1-o2;
		}
		
	};
	
	public static void main(String[] args) {
		
		Sorting<Integer> sort = new Sorting<Integer>();
		Integer[] in ={5 ,2, 1, 3, 4, 7,0,8,9};
		Integer[] sorted = sort.inserionSort(in,comapre);
		for (Integer e : sorted) {
			System.out.print(e+" ");
		}
		
	}
	
	

}


