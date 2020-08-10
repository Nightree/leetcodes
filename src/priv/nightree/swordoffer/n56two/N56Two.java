package priv.nightree.swordoffer.n56two;

class Solution {
    public int singleNumber(int[] nums) {
        int[] cnt = new int[31];
        int res = 0;
        for(int num : nums){
            for(int i = 0; i < 31; i++){
                cnt[i] += num >>> i & 1;
            }
        }
        for(int i = 0; i < 31; i++){
            res <<= 1;
            cnt[30 - i] %= 3;
            res += cnt[30 - i];
        }
        return res;
    }
}

public class N56Two {
    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[]{3, 3, 4, 3}));
    }
}
