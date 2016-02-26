package com.vijay.algorithms.ds.tree;

import java.util.Random;

public class BinarySearchTree {
	
	TreeNode root;

	public void generateBT(int n) {
		Random random = new Random(1000);
		for (int i = 0; i < n; i++) {
			add(random.nextInt(100));
		}

	}

	public boolean add(Integer node) {
		if (root == null) {
			root = new TreeNode(node);
			return true;
			
		} else {
			TreeNode current = root;
			
			int res = 0;

			while (true) {
				res = node.compareTo(current.data);
				if(res ==0){
					return false;
				}else if(res == 1){
					if (current.right == null) {
						current.right = new TreeNode(node);
						return true;
					} else {
						current = current.right;
					}
				}else{
					if (current.left == null) {
						current.left = new TreeNode(node);
						return true;
					} else {
						current = current.left;
					}
				}
				
			}

		}
	}
	
	public void display() {
		TreePrinter.print(root);
	}

}
