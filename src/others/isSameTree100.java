package others;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/29 上午8:28
 */
public class isSameTree100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        } else if (p==null||q==null) {
            return false;
        } else if (p.val!= q.val) {
            return false;
        }else {
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
    }
}
