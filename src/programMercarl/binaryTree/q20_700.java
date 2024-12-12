package programMercarl.binaryTree;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/5 上午10:24
 */
public class q20_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        TreeNode res= new TreeNode();
        if(root.val>val){
            res= searchBST(root.left,val);
        }
        if(root.val<val){
            res=searchBST(root.right,val);
        }
        return res;
    }
}
