import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressList {
    public int[] solution(int[] nums) {
        int i = 0;
        List<Integer> answer = new ArrayList<>();
        while(i < nums.length) {
            int count = nums[i];
            int value = nums[i+1];
            i += 2;
            for (int j = 0; j < count; j++) {
                answer.add(value);
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        DecompressList list = new DecompressList();
        int[] answer = list.solution(nums);
        System.out.println(Arrays.toString(answer));
        int[] x = {1,2};
        System.out.println(Arrays.toString(x.clone()));
        System.out.println("main");
    }
}
