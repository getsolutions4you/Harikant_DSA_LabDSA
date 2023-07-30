package com.bstpairsum.main;

import com.bstpairsum.service.CheckPairSum;

public class Driver {

	public static void main(String[] args) {
		CheckPairSum tree = new CheckPairSum();
		tree.root = tree.insert(tree.root, 40);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 60);
		tree.insert(tree.root, 10);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 50);
		tree.insert(tree.root, 70);
		int sum = 130;
		tree.findPairWithGivenSum(tree.root, sum);
	}

}
