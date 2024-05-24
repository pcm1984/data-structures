package com.pankaj.ds.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversal {
    List<Integer> inorderNodes = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root){

        if(root != null){
            inorderTraversal(root.left);
            inorderNodes.add(root.val);
            inorderTraversal(root.right);
        }
        return inorderNodes;

    }

    public static  void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        List<Integer> inorderNodes = binaryTreeTraversal.inorderTraversal(root);
        inorderNodes.forEach(System.out::print);
    }
}
