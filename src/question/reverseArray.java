

/**
 * @program: Leetcode
 * @description:
 * @author: pyq
 * @create: 2019-06-19 07:42
 **/

package question;

/**
 *  No.189
 */

public class reverseArray {
    public void rotate(int[] nums, int k) {
        // bound check
        int n = nums.length;
        if (nums==null || n <= 0 || k <= 0)
            return;
        // k maybe larger than length
        k = k % n;
        reverse(0, n - k - 1, nums);
        reverse(n - k, n-1, nums);
        reverse(0, n-1, nums);
    }

    private void reverse(int start, int end, int[] arr) {
        for (int i = start, j = end; i < j; i++, j--) {
            swap(i,j,arr);
        }
    }

    private void swap(int i, int j,int[] arr) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args){
        int nums[] = {1,4,7,9,0};
        int k = 2;
        reverseArray ra = new reverseArray();
        ra.rotate(nums,k);
        for(int i=0; i<nums.length;i++)
            System.out.println(nums[i]);
    }
}



   /* int[] num = {0};
    public void rotate(int[] nums, int k) {
        // 一个数组，以K为界分成两部分，两部分分别reverse，然后再整体reverse。
        // 写一个reverse方法，传参调用三次
        // [0,k-1],[k,nums.length-1]
        num = nums;
        if(k>nums.length){
            System.out.println("This is incorrent");
        }else{
            reverse(Arrays.copyOfRange( this.num,0, k - 1));
            reverse(Arrays.copyOfRange(this.num, k, nums.length - 1));
            reverse(Arrays.copyOfRange(this.num, 0, nums.length - 1));
            System.out.println(nums);
        }
    }

    private int[] reverse(int[] array){
        for(int i =0; i<array.length/2;i++){
            int temp = 0;
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        return array;
    }

    public static void main(String[] args){
        int nums[] = {1,4,5,7};
        int k = 2;
        reverseArray array = new reverseArray();
        array.rotate(nums, k) ;
    }



    private void reverse1(int[] nums, int start, int end) {
        int temp = 0;
        for(int i=start; i<(end+start)/2; i++){
            temp = nums[i];
            nums[i] = nums[nums.length-i-1] ;
            nums[nums.length-i] = temp;
        }
    }

    public void rotate1(int[] nums, int k) {
        // 利用mod除
        // 交换位置
        int temp = 0;

        for(int i=0;i<nums.length;i++){
            temp = nums[i];
            nums[i] = nums[nums.length-i] ;
            nums[nums.length-i] = temp;
        }
    }*/




