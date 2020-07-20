package priv.nightree.swordoffer.n33;

import java.util.Arrays;

class Solution {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null || postorder.length == 0) {
            return true;
        }
        int index = 0;
        while (postorder[index] < postorder[postorder.length - 1]) {
            index++;
        }
        for (int i = index; i < postorder.length - 1; i++) {
            if (postorder[i] < postorder[postorder.length - 1]) {
                return false;
            }
        }
        return verifyPostorder(Arrays.copyOfRange(postorder, 0, index)) && verifyPostorder(Arrays.copyOfRange(postorder, index, postorder.length - 1));
    }
}

public class N33 {
    public static void main(String[] args) {
        System.out.println(new Solution().verifyPostorder(new int[]{5, 10, 6, 9}));

    }
}
