package programMercarl.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/30 下午10:23
 */
public class q7_111 {
    public int minDepth(TreeNode root) {
        int res=0;
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            int size =queue.size();
            res++;
            for (int i = 0; i < size; i++) {
                TreeNode cur =queue.poll();
                if(cur.left==null&&cur.right==null){
                    return res;
                }
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
            }
        }
        return res;
    }
}
