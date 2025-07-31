import java.util.*;
public class leetcode1695 {
    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int left = 0, currentSum = 0, maxSum = 0;

        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            currentSum += nums[right];
            maxSum = Math.max(maxSum, currentSum);;;;;
        }

        return maxSum;
    }

    // 🔹 Main method to test the function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int result = maximumUniqueSubarray(nums);
        System.out.println("Maximum Erasure Value: " + result);  // Expected: 17
    }
}
