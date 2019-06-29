package question.tree;


/*
2019/3/10
1/100
 */




import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structure.Node;

public class q429 {
    // ����һ�� N ������������ڵ�ֵ�Ĳ�������� (�������ң�������)��
    public List<List<Integer>> levelOrder(Node root) {
       List<List<Integer>> retList = new ArrayList<>();
       Queue<Node> nodeQueue = new LinkedList<>();
       if(root==null) return retList;
       nodeQueue.offer(root);

       while(!nodeQueue.isEmpty()){
           List<Integer> nodeLayerList = new ArrayList<>();
           Node curNode = nodeQueue.poll();
           for(int i=0; i<nodeQueue.size();i++){
               nodeLayerList.add(curNode.val);
               if(curNode.children!=null){
                   for(Node tmp:curNode.children)
                       nodeQueue.add(tmp);
               }
           }
           retList.add(nodeLayerList);
       }
       return  retList;
    }
}














