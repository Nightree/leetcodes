package priv.nightree.test;

class Solution {

    private int res = 0;

    public int InversePairs(int [] array) {
        mergeSort(array, 0, array.length);
        return res;
    }

    private int[] mergeSort(int[] array, int start, int end){
        if(start == end - 1){
            return new int[]{array[start]};
        }
        int mid = start + (end - start) / 2;
        int[] a1 = mergeSort(array, start, mid);
        int[] a2 = mergeSort(array, mid, end);
        return connect(a1, a2);
    }

    private int[] connect(int[] a1, int[] a2){
        int i = 0, j = 0, k = 0;
        int[] con = new int[a1.length + a2.length];
        while(i < a1.length && j < a2.length){
            if (a1[i] <= a2[j]) {
                con[k++] = a1[i++];
            } else if (a1[i] > a2[j]) {
                con[k++] = a2[j++];
                res += a1.length - i;
                res %= 1000000007;
            }
        }
        while(i < a1.length){
            con[k++] = a1[i++];
        }
        while(j < a2.length){
            con[k++] = a2[j++];
        }
        return con;
    }
}

public class Test {
    public static void main(String[] args) {
        int res = new Solution().InversePairs(new int[]{1, 2, 3, 4, 5, 6, 7, 0});
        System.out.println(res);
    }
}
