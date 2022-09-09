import java.util.*;

// LeetCode: 2248
public class ArrayIntersection {
    public List<Integer> solution(int[][] nums) {
        List<Integer> result = new ArrayList<>();
        int lengthOfNums = nums.length;
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < lengthOfNums; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(!myMap.containsKey(nums[i][j])){
                    myMap.put(nums[i][j], 1);
                }
                else {
                    myMap.put(nums[i][j], myMap.get(nums[i][j])+1);
                }
            }
        }
        for(int key: myMap.keySet()) {
            int mapKeyValue = myMap.get(key);
            if (mapKeyValue == lengthOfNums) {
                result.add(key);
            }
        }
        result.sort(Comparator.naturalOrder());
        return result;
    }
    public static void main(String[] args) {
        int[][] nums = {{7,34,45,10,12,27,13},{27,21,45,10,12,13}};
        System.out.println(nums[1].length);
        ArrayIntersection myArray = new ArrayIntersection();
        System.out.println(myArray.solution(nums));
    }
}
