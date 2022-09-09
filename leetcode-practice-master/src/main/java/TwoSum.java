import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// LeetCode 1
public class TwoSum {
    public int[] solution(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int i = 0;
        while(i < nums.length) {
            int current = nums[i];
            int remainder = target - current;
            if (myMap.get(current) != null) {
                return new int[]{myMap.get(current), i};
            }
            myMap.putIfAbsent(remainder, i);
            i++;
        }
        return null;
    }
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {1,2,7,11,15};
        int[] ans = twoSum.solution(nums, 9);
        Arrays.stream(ans).asLongStream().forEach(System.out::println);
    }
}
