package programMercarl.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/30 下午9:31
 */
public class q1_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> lists=new ArrayList<>();
        if(root != null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int size= queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.add(treeNode.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
