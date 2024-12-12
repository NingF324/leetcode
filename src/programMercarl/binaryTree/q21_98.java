package programMercarl.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/5 上午10:29
 */
public class q21_98 {
    List<Integer> list=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        traversal(root);
        if(list.size()<=1){
            return true;
        }
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i)<= list.get(i-1)){
                return false;
            }
        }
        return true;
    }

    public void traversal(TreeNode node) {
        if(node==null){
            return;
        }
        traversal(node.left);
        list.add(node.val);
        traversal(node.right);
    }
}
