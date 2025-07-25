import java.util.*;

class leetcode3487 {
    public static int maxSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        if (max <= 0) return max;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0 && !set.contains(num)) {
                sum += num;
                set.add(num);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        leetcode3487 sol = new leetcode3487();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = sol.maxSum(nums);
        System.out.println("Maximum sum of unique positive integers: " + result);
    }
}
