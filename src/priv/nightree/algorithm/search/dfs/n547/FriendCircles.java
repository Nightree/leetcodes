package priv.nightree.algorithm.search.dfs.n547;

class Solution {
    public int findCircleNum(int[][] friends) {
        boolean[] flags = new boolean[friends.length];
        int res = 0;
        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) {
                res++;
                dfs(friends, flags, i);
            }
        }
        return res;
    }

    private void dfs(int[][] friends, boolean[] flags, int f) {
        flags[f] = true;
        for (int i = 0; i < friends[f].length; i++) {
            if (friends[f][i] == 1 && !flags[i]) {
                dfs(friends, flags, i);
            }
        }
    }
}

public class FriendCircles {
    public static void main(String[] args) {
        int[][] friends = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println(new Solution().findCircleNum(friends));

    }
}
