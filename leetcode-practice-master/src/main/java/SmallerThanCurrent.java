import java.util.Arrays;

//leetcode 1365
public class SmallerThanCurrent {
    public int[] solution(int[] nums) {
        int count;
        int index = 0;
        int[] answer = new int[nums.length];
        for(int x: nums) {
            count = 0;
            for(int y: nums) {
                if(x > y) count++;
            }
            answer[index] = count;
            index++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        SmallerThanCurrent smaller = new SmallerThanCurrent();
        int[] answer = smaller.solution(nums);
        System.out.println(Arrays.toString(answer));
        System.out.println("main");
    }
}
