package priv.nightree.datastructure.graph.bipartite.n785;

class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] node = new int[graph.length];
        boolean res = true;
        for (int i = 0; i < node.length; i++) {
            if (node[i] == 0 && graph[i].length != 0) {
                res = res && dfs(graph, node, i, 1);
            }
        }
        return res;
    }

    public boolean dfs(int[][] graph, int[] node, int index, int color) {
        if (node[index] == 0) {
            node[index] = color;
            if (graph[index].length == 0) {
                return index + 1 >= graph.length || dfs(graph, node, index + 1, 1);
            } else {
                for (int i : graph[index]) {
                    if (!dfs(graph, node, i, color == 1 ? 2 : 1)) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return node[index] == color;
        }
    }
}

public class IsGraphBipartite {
    public static void main(String[] args) {
        int[][] graph1 = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        int[][] graph2 = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        int[][] graph3 = {{}, {2, 3}, {1, 3}, {1, 2}};
        int[][] graph4 = {{}};
        System.out.println(new Solution().isBipartite(graph2));

    }
}
