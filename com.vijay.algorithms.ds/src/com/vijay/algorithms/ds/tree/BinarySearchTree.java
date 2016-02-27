package com.vijay.algorithms.ds.tree;

import java.util.Random;
import java.util.Stack;

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
	
	
	public void inorder() {
		inorder(root);
	}
	
	public void preorder() {
		preorder(root);
	}
	
	public void postorder() {
		postorder(root);
	}

	
	private void inorder(TreeNode current){
		if(current == null){return;}
		inorder(current.left);
		System.out.print(current.data+" ");
		inorder(current.right);
	}
	
	private void preorder(TreeNode current){
		if(current == null){return;}
		System.out.print(current.data+" ");
		preorder(current.left);
		preorder(current.right);
	}
	
	private void postorder(TreeNode current){
		if(current == null){return;}
		postorder(current.left);
		postorder(current.right);
		System.out.print(current.data+" ");
	}

	public Integer minElement() {
		return minElement(root);
		
	}

	private Integer minElement(TreeNode current) {
		if(current == null){return null;}
		if(current.left ==null){return current.data;}
		return minElement(current.left);
		
	}

	public Integer maxElement() {
		return maxElement(root);
	}

	private Integer maxElement(TreeNode current) {
		if(current == null){return null;}
		if(current.right ==null){return current.data;}
		return maxElement(current.right);
	}
	
	
	private int kthSmallest(TreeNode root, int k) {
	    Stack<TreeNode> stack = new Stack<TreeNode>();
	 
	    TreeNode p = root;
	    int result = 0;
	 
	    while(!stack.isEmpty() || p!=null){
	        if(p!=null){
	            stack.push(p);
	            p = p.left;
	        }else{
	            TreeNode t = stack.pop();
	            k--;
	            if(k==0)
	                result = t.data;
	            p = t.right;
	        }
	    }
	 
	    return result;
	}

	public Integer select(int k) {
		return kthSmallest(root,k); 
		
	}

//	private Integer select(TreeNode current, int k, Integer count) {
//		
//		Integer select = select(current.left, k, count);
//		if(select !=null){return select;}
//		
//		count++;
//		if(count == k){return current.data;}
//		
//		
//		
//		
//		if(current.left !=null){
//			Integer select = select(current.left, k, count);
//			if(select !=null){return select;}
//		}
//		count++;
//		if(count == k){
//			return current.data;
//		}
//		
//		Integer select = select(current.right, k, count);
//		if(select !=null){return select;}
//		
//		return null;
////		return select(current.right, k, count);
		
		
		
		
//		Integer select = select(current.left, k, count);
//		if(select !=null){return select;}
//		++count;
//		if(count == k){
//			return current.data;
//		}
//		
//		 return select(current.right, k, count);
		 
		
//		Integer select2 = select(current.right, k, count);
//		if(select2 !=null){return select2;}
		
//		return null;
		
		
				
//		//Move to left most element
//		if(current.left !=null){
//			Integer select = select(current.left, k, count);
//			if(select !=null){
//				return select;
//			}
//			++count;
//			if(count == k){
//				return current.data;
//			}
//			
//			Integer select2 = select(current.right, k, count);
//			if(select2 !=null){
//				return select2;
//			}else{
//				return null;
//			}
//			
//			
//		}
//		++count;
//		if(count == k){
//			return current.data;
//		}else{
//			return null;
//		}
//		
		
		
		
		
		
		
		
						
//	}

		

	


}
