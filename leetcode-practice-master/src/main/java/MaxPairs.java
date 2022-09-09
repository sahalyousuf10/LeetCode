import java.util.HashMap;
import java.util.Map;

//LeetCode 2341
public class MaxPairs {
    public int[] solution(int[] nums) {
        int remainder =  0;
        int pairs = 0;
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int x: nums) {
            if (myMap.get(x) == null) {
                myMap.put(x,1);
            }
            else{
                int currentValue = myMap.get(x);
                myMap.put(x, currentValue + 1);
            }
        }
        for(int key: myMap.keySet()) {
            int p = (int) myMap.get(key) / 2;
            int r = myMap.get(key) % 2;
            remainder += r;
            pairs += p;
        }
        int[] ans = {pairs, remainder};
        return ans;
    }
    public static void main(String[] args) {
        MaxPairs maxPairs = new MaxPairs();
        int[] arr = {1,3,2,1,3,2,2};
        int[] ans = maxPairs.solution(arr);
        System.out.println(maxPairs.solution(arr));
    }
}
