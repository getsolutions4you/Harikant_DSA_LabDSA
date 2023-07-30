package com.bstpairsum.service;

import java.util.HashSet;
import java.util.Set;

class Node {
	int nodeData;
	Node left, right;

	public Node(int nodeData) {
		this.nodeData = nodeData;
		left = right = null;
	}
}

public class CheckPairSum {
	public Node root;

	public Node insert(Node node, int key) {
		// if tree is empty return new Node;
		if (node == null) {
			node = new Node(key);
			return node;
		}
		// otherwise recur down the tree
		if (key < node.nodeData) {
			node.left = insert(node.left, key);
		} else if (key > node.nodeData) {
			node.right = insert(node.right, key);
		}
		return node;
	}

	public void findPairWithGivenSum(Node root, int sum) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		if (!findPairUtil(root, sum, set))
			System.out.print("Nodes are not found" + "\n");

	}

	public boolean findPairUtil(Node root, int sum, Set<Integer> set) {
		// TODO Auto-generated method stub
		if (root == null)
			return false;
		if (findPairUtil(root.left, sum, set))
			return true;
		int diff = sum - root.nodeData;
		if (set.contains(diff)) {
			System.out.println("Sum = " + sum);
			System.out.println("Pair is (" + (sum - root.nodeData) + ", " + root.nodeData + ")");
			return true;
		} else {
			set.add(root.nodeData);
		}

		return findPairUtil(root.right, sum, set);
	}

	public void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.nodeData + " ");
		inOrder(root.right);

	}

	public void traverse(Node root) {
		if (root != null) {
			traverse(root.left);
			System.out.println(root.nodeData);
			traverse(root.right);
		}
	}

}
