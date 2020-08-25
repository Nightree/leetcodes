package priv.nightree.basic.sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        //1.调整为大顶堆
        //从最后一个非叶子结点开始直到根节点0，调整结构
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for (int subLen = arr.length - 1; subLen > 0; subLen--) {
            swap(arr, 0, subLen);//将堆顶元素与末尾元素进行交换
//            System.out.println(Arrays.toString(arr));
            adjustHeap(arr, 0, subLen);//重新对堆进行调整
        }

    }

    /**
     * 调整大顶堆，需满足条件：i节点左右子树是最大堆
     */
    public static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        for (int j = i * 2 + 1; j < length; j = j * 2 + 1) {//从i结点的左子结点开始，也就是2i+1处开始
            if (j + 1 < length && arr[j + 1] > arr[j]) {//如果左子结点小于右子结点，j指向右子结点
                j++;
            }
            if (arr[j] > temp) {//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[j];
                i = j;//要调整的i节点往下降
            } else {
                break;//最大堆特性，下面的节点都小于temp
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
