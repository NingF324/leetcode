package programMercarl.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/30 下午9:50
 */
public class q3_199 {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list =new ArrayList<>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode treeNode=queue.poll();
                if(i==size-1){
                    list.add(treeNode.val);
                }
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.add(treeNode.right);
                }
            }
        }
        return list;
    }
}
