package priv.nightree.algorithm.search.bfs.n127;

import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        boolean[] flag = new boolean[wordList.size() + 1];
        String[] words = wordList.toArray(new String[wordList.size()]);
        int res = 0;
        queue.add(beginWord);
        while (!queue.isEmpty()) {
            int size = queue.size();
            res++;
            while (size-- > 0) {
                String poll = queue.poll();
                for (int i = 0; i < words.length; i++) {
                    if (flag[i]) {
                        continue;
                    }
                    if (cmpStr(poll, words[i])) {
                        if (words[i].equals(endWord)) {
                            return res+1;
                        }
                        queue.add(words[i]);
                        flag[i] = true;
                    }
                }
            }
        }
        return 0;
    }

    public boolean cmpStr(String s1, String s2) {
        int n = 0;
        for (int i = 0; i < s1.length() && n <= 1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                n++;
            }
        }
        return n == 1;
    }
}

public class WordLadder {
    public static void main(String[] args) {
        String beginWord = "hit", endWord = "cog";
        List<String> wordList = new ArrayList<>(
                Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        System.out.println(new Solution().ladderLength(beginWord, endWord, wordList));
    }
}
