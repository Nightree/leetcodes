package priv.nightree.swordoffer.n11;

class Solution {
    public int minArray(int[] numbers) {
        int l = 0, r = numbers.length - 1;
        if (numbers.length == 1) {
            return numbers[0];
        }
        while (l <= r) {
            if (numbers[l + 1] >= numbers[l]) {
                l++;
            } else {
                return numbers[l + 1];
            }
            if (numbers[r - 1] <= numbers[r]) {
                r--;
            } else {
                return numbers[r];
            }
        }
        return numbers[0];
    }
}

public class N11 {
    public static void main(String[] args) {
        int[] numbers = {3, 0, 1, 2};
        System.out.println(new Solution().minArray(numbers));
    }
}
