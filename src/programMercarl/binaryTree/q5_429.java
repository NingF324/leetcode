package programMercarl.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/30 下午10:03
 */
public class q5_429 {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if(root !=null){
            queue.add(root);
        }
        List<List<Integer>> res=new ArrayList<>();
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                list.add(node.val);
                node.children.forEach((node1 -> {
                    if(node1!=null){
                        queue.add(node1);
                    }
                }));
            }
            res.add(list);
        }
        return res;
    }
}
