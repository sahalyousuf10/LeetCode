import java.util.Arrays;

// leetcode 1480
public class RunningSum {
    public int[] solution(int[] nums) {
        int sum = 0;
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            answer[i] = sum;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        RunningSum sum = new RunningSum();
        System.out.println(Arrays.toString(sum.solution(nums)));}
}
