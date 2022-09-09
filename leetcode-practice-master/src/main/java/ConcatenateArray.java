// leetcode 1929

import java.util.Arrays;
public class ConcatenateArray {
    public int[] solution(int[] nums) {
        int totalLength = nums.length * 2;
        int[] answer = new int[totalLength];
        System.arraycopy(nums, 0, answer, 0, nums.length);
        System.arraycopy(nums, 0, answer, nums.length, nums.length);
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ConcatenateArray array = new ConcatenateArray();
        System.out.println(Arrays.toString(array.solution(nums)));

    }
}
