// LeetCode: 2239
public class ClosestToZero {

    public int solution(int[] nums) {
        int min = Integer.MAX_VALUE;
        int number = 0;
        for(int x: nums) {
            if(x == 0) {
                return 0;
            }
            else if (Math.abs(x) < Math.abs(min)){ // min = -4, x = 1
                min = x;
            }
            else if(Math.abs(x) == Math.abs(min)) {
                min = Math.max(x, min);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-2,2,4,8};
        ClosestToZero zero = new ClosestToZero();
        System.out.println(zero.solution(nums));
    }
}
