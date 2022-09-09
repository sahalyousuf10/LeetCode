import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode 1431
public class GreatestNumberOfCandies {
    List<Boolean> solution(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int max = 0;
        for (int x: candies) {
            if(x> max) max = x;
        }
        for(int x: candies) {
            if(x+extraCandies >= max) {
                answer.add(true);
            }else answer.add(false);

        }
        return answer;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        GreatestNumberOfCandies greatest = new GreatestNumberOfCandies();
        List<Boolean> answer = greatest.solution(candies, extraCandies);
        System.out.println(answer.toString());
        System.out.println("candies");
    }
}
