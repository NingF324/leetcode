package hot100;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/5/6 下午3:02
 */
public class SearchInsert14 {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        System.out.print(searchInsert(arr,2));
    }
}
