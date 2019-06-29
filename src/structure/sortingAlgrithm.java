package structure;

/**
 * @program: Leetcode
 * @author: Programming Queen
 * @create: 2019-06-25 08:25
 **/

//TODO: 还有8个排序算法没写
public class sortingAlgrithm {
    // bubble sort
    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[j - 1])
                    swap(j, j - 1, arr);
            }
        }
    }

    private static void swap(int x, int y, int[] arr) {
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] = t;
    }

    // Add a flag
    public static void BubbleSort1(int[] arr) {
        boolean flag;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            flag = false;
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]){
                    swap(j,j-1,arr);
                    flag = true;
                }
            }
            if(!flag)
                break;
        }
    }

    // SelectionSort

}

