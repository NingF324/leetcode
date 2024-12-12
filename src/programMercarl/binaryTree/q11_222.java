package programMercarl.binaryTree;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/31 上午10:43
 */
public class q11_222 {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        TreeNode left=root.left;
        TreeNode right=root.right;
        int leftDepth=0,rightDepth=0;
        while (left!=null){
            leftDepth++;
            left=left.left;
        }
        while (right!=null){
            rightDepth++;
            right=right.right;
        }
        if(leftDepth==rightDepth){
            return (int)Math.pow(2,leftDepth+1)-1;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
