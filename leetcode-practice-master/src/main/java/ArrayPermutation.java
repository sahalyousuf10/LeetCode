import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// leetcode 1920
public class ArrayPermutation {
    public int[] solution(int[] nums){
        List<Integer> answer = new ArrayList<>();
        for(Integer x : nums) {
            answer.add(nums[x]);
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        ArrayPermutation myArray = new ArrayPermutation();
        int[] answer = myArray.solution(nums);
        System.out.println(Arrays.toString(answer));
        System.out.println("permutation");
    }
}
