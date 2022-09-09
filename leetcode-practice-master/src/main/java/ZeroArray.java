// LeetCode: 2357
public class ZeroArray {
    public int sums(int[] nums) {
        int sum = 0;
        for(int x: nums) {
            sum = sum + x;
        }
        return sum;
    }
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int x: nums) {
            if (x < min && x != 0) {
                min = x;
            }
        }
        return min;
    }
    public int solution(int[] nums) {
        int count = 0;
        int sum = sums(nums);
        while(sum > 0) {
            int min = findMin(nums);
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != 0) {
                    nums[i] = nums[i] - min;
                }
            }
            sum = sums(nums);
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        ZeroArray zero = new ZeroArray();
        int[] myNums = {1,5,0,3,5};
        System.out.println(zero.solution(myNums));
    }

}
