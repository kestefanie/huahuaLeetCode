package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal94 {

    // recursive
//    public List<Integer> inorderTraversal(TreeNode root) {
//        if(root == null) return new ArrayList<Integer>();
//        List<Integer> result = new ArrayList<Integer>();
//        if(root.left != null) result.addAll(inorderTraversal(root.left));
//        result.add(root.val);
//        if(root.right != null) result.addAll(inorderTraversal(root.right));
//        return result;
//    }
    // iterative
    // iterative 也可以用stack来完成
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        iterativeHelper(result, root.left);
        result.add(root.val);
        iterativeHelper(result, root.right);
        return result;
    }

    public void iterativeHelper(List<Integer> result, TreeNode node) {
        if(node != null) {
            iterativeHelper(result, node.left);
            result.add(node.val);
            iterativeHelper(result, node.right);
        }
    }
}
