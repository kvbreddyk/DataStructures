package com.vijay.algorithms.ds.sorting;

import java.util.Comparator;

public class Sorting<T> {
	
	public T[] inserionSort(T[] in,Comparator<T> compator){
		int i=0,j=0;
		for( i=1;i<in.length;i++){
			T tmp = in[i];
			
			for(j = i-1;j>=0;j--){
				if(compator.compare(tmp,in[j])<0){
					in[j+1] = in[j]; 
				} else {
					in[j+1] = tmp;
					break;
				}
			}
			
			if(j==-1)in[j+1] = tmp;
			
			
		}
		return in;
		
	}

}
