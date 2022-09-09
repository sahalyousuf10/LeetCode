import java.util.Arrays;

// leetcode 1470
public class ShuffleArray {
    public int[] solution(int[] nums, int n) {
        int[] answer = new int[2*n];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            answer[pos] = nums[i];
            answer[pos+1] = nums[i+n];
            pos += 2;
        }
        return answer;
    }
    public static void main(String[] args) {
        ShuffleArray shuffle = new ShuffleArray();
        int[] nums = {2,5,1,3,4,7};
        int[] answer = shuffle.solution(nums, 3);
        System.out.println(Arrays.toString(answer));
    }
}
