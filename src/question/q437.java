package question;

import structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class q437 {
    /*
    给定一个二叉树，它的每个结点都存放着一个整数值。
    找出路径和等于给定数值的路径总数。
    路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
    二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
    */
    private int count = 0;
    // 如果sum为3，有多条路径1，1，1，那么这属于不同的结果
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        // 层次遍历每个结点，每个结点调用函数pathSumCore
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            pathSumCore(node, sum);
            if (node.left != null)
                q.offer(node.left);
            if (node.right != null)
                q.offer(node.right);
        }
        return count;
    }

    private void pathSumCore(TreeNode root, int sum) {
        if (root != null) {
            if (sum - root.val == 0) {
                count++;
                // 因为后续有可能出现相加等于0的情况，不需要return
                // return;
            }
            pathSumCore(root.left, sum - root.val);
            pathSumCore(root.right, sum - root.val);
        }
    }


}

//    public int pathSum(TreeNode root, int sum) {
//        if (root == null)
//            return 0;
//        //return dfs(root, sum) + pathSum1(root.left, sum) + pathSum1(root.right, sum);
//        return dfsCore(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
//    }
//    private int dfsCore(TreeNode root, int sum) {
//        int res = 0;
//        if (root == null)
//            return res;
//        if (root.val == sum)
//            res++;
//        res+=dfsCore(root.left, sum - root.val);
//        res+=dfsCore(root.right, sum - root.val);
//        return res;
//
//    }



//    private int dfs(TreeNode root, int sum) {
//        if (root == null)
//            return 0;
//        if (sum == root.val)
//            return 1 + dfs(root.left, 0)
//                    + dfs(root.right, 0);
//        return dfs(root.left, sum - root.val)
//                + dfs(root.right, sum - root.val);
//    }