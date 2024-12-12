package programMercarl.binaryTree;

import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/30 下午10:03
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};