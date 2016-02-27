package com.vijay.algorithms.ds.tree;

public class Test {
	
	public static void main(String[] args) {
//		BinaryTree bt = new BinaryTree();
//		bt.generateBT(10);
//		bt.display();
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.generateBT(10);
		bst.display();
		bst.inorder();
		System.out.println();
		bst.preorder();
		System.out.println();
		bst.postorder();
//		bst.select(3);
		System.out.println(String.format("Smallest Element in the Tree is :%s",bst.minElement()));
		System.out.println(String.format("Maximum Element in the Tree is :%s",bst.maxElement()));
		
		int k =10;
		System.out.println(String.format("%sth smallest in the Tree is :%s",k,bst.select(k)));
	}
	
}
