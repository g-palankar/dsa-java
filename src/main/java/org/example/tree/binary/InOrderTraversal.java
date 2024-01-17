package org.example.tree.binary;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>(List.of(root.val));
        if(root.left != null) res.addAll(inorderTraversal(root.left));
        if(root.right != null) res.addAll(inorderTraversal(root.right));
        return res;
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode node = new TreeNode(3, left, null);
        List<Integer> result = inorderTraversal(node);
        System.out.println(result);
    }
}
