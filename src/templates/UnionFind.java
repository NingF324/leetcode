package templates;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/21 22:13
 */
public class UnionFind {
    private int[] parent; // 存储每个元素的父节点
    private int[] rank; // 存储每个根节点的秩（深度）

    // 初始化并查集
    public UnionFind(int size) {
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i; // 初始时，每个元素的父节点都是自己
            rank[i] = 1; // 初始时，每个根节点的秩都是1
        }
    }

    // 查找元素的根节点（带路径压缩）
    public int find(int x) {
        if (parent[x] == x) {
            return x; // 如果是根节点，返回自身
        }
        // 路径压缩：直接将x的父节点设置为根节点
        parent[x] = find(parent[x]);
        return parent[x];
    }

    // 合并两个集合
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            // 根据两个根节点的秩来决定合并策略
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX; // 将秩较小的树合并到秩较大的树
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX; // 秩相同，合并后根节点的秩加1
                rank[rootX]++;
            }
        }
    }

    // 判断两个元素是否属于同一个集合
    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }
}
