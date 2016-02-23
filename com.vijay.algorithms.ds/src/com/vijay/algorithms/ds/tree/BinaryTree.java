package com.vijay.algorithms.ds.tree;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class BinaryTree {

	TreeNode root;

	public void generateBT(int n) {
		Random random = new Random(100);
		for (int i = 0; i < n; i++) {
			add(random.nextInt(100));
		}

	}

	public void add(int node) {
		if (root == null) {
			root = new TreeNode(node);
		} else {
			TreeNode current = root;
			double random = 0;

			while (current != null){
				random = Math.random();
				if (random < 0.5) {
					current = current.left;
				} else {
					current = current.right;
				}
			}
			
			current = new TreeNode(node);
		}
	}
	
	public void display(){
		
		Queue<TreeNode> q = new PriorityQueue<TreeNode>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()){
			TreeNode remove = q.remove();
			if(remove !=null){
				System.out.print(remove.data);
				if(remove.left !=null){
					q.add(remove.left);
				}
				if(remove.right !=null){
					q.add(remove.right);
				}
				q.add(null);
			}else{
				System.out.println();
			}
			
		}
		
	}

	

}
