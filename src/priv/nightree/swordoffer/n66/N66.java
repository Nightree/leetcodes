package priv.nightree.swordoffer.n66;

class Solution {
    public int[] constructArr(int[] a) {
        if (a.length == 0) {
            return new int[0];
        }
        int[] b = new int[a.length];
        b[0] = 1;
        for (int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }
        b[a.length - 2] = b[a.length - 2] * a[a.length - 1];
        for (int i = a.length - 3; i >= 0; i--) {
            a[i + 1] = a[i + 1] * a[i + 2];
            b[i] *= a[i + 1];
        }
        return b;
    }
}

public class N66 {
    public static void main(String[] args) {
        int[] res = new Solution().constructArr(new int[]{1, 2, 3, 4, 5});
        for (int r : res) {
            System.out.println(r);
        }
    }
}
