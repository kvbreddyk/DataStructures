package com.vijay.algorithms.ds.tree;

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

			while (true) {
				random = Math.random();
				if (random <= 0.5) {
					if (current.left == null) {
						current.left = new TreeNode(node);
						break;
					} else {
						current = current.left;
					}
				} else {
					if (current.right == null) {
						current.right = new TreeNode(node);
						break;
					} else {
						current = current.right;
					}

				}
			}

		}
	}

	public void display() {

		TreePrinter.print(root);
		
//		Queue<TreeNode> q = new LinkedList<TreeNode>();
//		q.add(root);
//		q.add(new TreeNode(0));
//
//		while (!q.isEmpty()) {
//			TreeNode remove = q.remove();
//			if (remove != null && remove.data !=0) {
//				System.out.print(remove.data+"  ");
//				if (remove.left != null) {
//					q.add(remove.left);
//				}
//				if (remove.right != null) {
//					q.add(remove.right);
//				}
//				q.add(new TreeNode(0));
//			} else {
//				System.out.println();
//			}
//
//		}
//
	}

}
