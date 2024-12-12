package programMercarl.binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/31 下午2:18
 */
public class q13_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        List<Integer> list =new ArrayList<>();
        traversal(root,list,res);
        return res;
    }

    public void traversal(TreeNode node,List<Integer> list,List<String> res){
        list.add(node.val);
        if(node.left==null&&node.right==null){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size() - 1; i++) {
                sb.append(list.get(i));
                sb.append("->");
            }
            sb.append(list.getLast());
            res.add(new String(sb));
        }
        if(node.left!=null){
            traversal(node.left,list,res);
            list.removeLast();
        }
        if (node.right!=null){
            traversal(node.right,list,res);
            list.removeLast();
        }
    }
}
