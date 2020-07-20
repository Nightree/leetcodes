package priv.nightree.swordoffer.n46;

class Solution {
    public int translateNum(int num) {
        if (num / 10 == 0) {
            return 1;
        }
        int lastRes2 = 1, lastRes1 = 1, curRes = 0, lastNum = num % 10, curNum;
        num /= 10;
        while (num != 0) {
            curNum = num % 10;
            if (curNum == 1 || (curNum == 2 && lastNum <= 5)) {
                curRes = lastRes1 + lastRes2;
            } else {
                curRes = lastRes1;
            }
            lastRes2 = lastRes1;
            lastRes1 = curRes;
            lastNum = curNum;
            num /= 10;
        }
        return curRes;
    }
}

public class N46 {
    public static void main(String[] args) {
        System.out.println(new Solution().translateNum(506));
    }
}
