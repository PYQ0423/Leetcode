package question.tree;

import structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class q437 {
    /*
    ����һ��������������ÿ����㶼�����һ������ֵ��
    �ҳ�·���͵��ڸ�����ֵ��·��������
    ·������Ҫ�Ӹ��ڵ㿪ʼ��Ҳ����Ҫ��Ҷ�ӽڵ����������·��������������µģ�ֻ�ܴӸ��ڵ㵽�ӽڵ㣩��
    ������������1000���ڵ㣬�ҽڵ���ֵ��Χ�� [-1000000,1000000] ��������
    */
    private int count = 0;
    // ���sumΪ3���ж���·��1��1��1����ô�����ڲ�ͬ�Ľ��
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        // ��α���ÿ����㣬ÿ�������ú���pathSumCore
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
                // ��Ϊ�����п��ܳ�����ӵ���0�����������Ҫreturn
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