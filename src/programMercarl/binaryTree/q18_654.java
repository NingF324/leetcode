package programMercarl.binaryTree;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/5 上午9:10
 */
public class q18_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return traversal(nums,0, nums.length);
    }

    public TreeNode traversal(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        if(right-left<1){
            return null;
        }
        if(right-left==1){
            return new TreeNode(nums[0]);
        }
        int maxIndex=left;
        for (int i = left+1; i < right; i++) {
            if(nums[i]>nums[maxIndex]){
                maxIndex=i;
            }
        }
        TreeNode root =new TreeNode(nums[maxIndex]);
        root.left=traversal(nums,left,maxIndex);
        root.right=traversal(nums,maxIndex+1,right);
        return root;
    }
}
