// leetcode 1512
public class NumberPair {
    public int solution(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        NumberPair pair = new NumberPair();
        System.out.println(pair.solution(nums));
        System.out.println("number pair");
    }
}
