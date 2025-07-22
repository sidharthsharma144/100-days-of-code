import java.util.*;
public class leetcode1695{

    public static int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int maxSum = 0;
        int currentSum = 0;

        for (int right = 0; right < nums.length; right++) {
            // Check for duplicate in current window [left, right)
            for (int i = left; i < right; i++) {
                if (nums[i] == nums[right]) {
                    // Remove all elements up to and including the duplicate
                    while (nums[left] != nums[right]) {
                        currentSum -= nums[left];
                        left++;
                    }
                    // Remove the duplicate itself
                    currentSum -= nums[left];
                    left++;
                    break;
                }
            }

            // Add the current element to the currentSum
            currentSum += nums[right];
            maxSum = Math.max(maxSum, currentSum);
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
