package programMercarl.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/31 下午3:09
 */
public class q15_513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        List<Integer> list=new ArrayList<>();
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i=0;i<size;i++){
                TreeNode treeNode=queue.poll();
                if(i==0){
                    list.add(treeNode.val);
                }
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if (treeNode.right!=null){
                    queue.add(treeNode.right);
                }
            }
        }
        return list.getLast();
    }
}
