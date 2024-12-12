package others;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/26 上午10:59
 */
public class maxDepth104 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
