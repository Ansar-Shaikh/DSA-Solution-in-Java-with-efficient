import java.util.Arrays;

class RotateArrays {
    public static void reverse(int nums[], int start, int end) {
        while (start <= end)
{
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public String rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // to handle cases where k is greater than the length of the array
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        return Arrays.toString(nums);
    }

    public static void main(String[] args) {
       RotateArrays sol = new RotateArrays();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k =8 ;
        String result = sol.rotate(nums, k);
        System.out.println(result);
    }
}
