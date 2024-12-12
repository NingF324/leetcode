package programMercarl.binaryTree;

import java.util.Arrays;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/5 上午8:25
 */
public class q17_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0){
            return null;
        }
        return traversal(inorder,postorder);
    }
    public TreeNode traversal(int[] inorder,int[] postorder){
        if(inorder.length==0){
            return null;
        }
        int rootV = postorder[postorder.length-1];
        TreeNode root =new TreeNode(rootV);
        if(inorder.length==1){
            return root;
        }

        int splitPoint;
        for (splitPoint=0; splitPoint < inorder.length; splitPoint++) {
            if(inorder[splitPoint]==rootV){
                break;
            }
        }
        int[] inorder_left=Arrays.copyOfRange(inorder,0,splitPoint);
        int[] inorder_right=Arrays.copyOfRange(inorder,splitPoint+1,inorder.length);
        int[] postorder_left=Arrays.copyOfRange(postorder,0,inorder_left.length);
        int[] postorder_right=Arrays.copyOfRange(postorder,inorder_left.length,postorder.length-1);
        root.left=buildTree(inorder_left,postorder_left);
        root.right=buildTree(inorder_right,postorder_right);
        return root;
    }

    public static void main(String[] args) {
        int[] inorder={9,3,15,20,7};
        int[] postorder={9,15,7,20,3};
        q17_106 m=new q17_106();
        System.out.println(m.buildTree(inorder,postorder).toString());
    }
}
