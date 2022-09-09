import java.util.List;
import java.util.Objects;

public class CountItem {
    public int solution(List<List<String>> items, String ruleKey, String ruleValue){
        int index = 0;
        int count = 0;
        if(Objects.equals(ruleKey, "type")) index = 0;
        else if (Objects.equals(ruleKey, "color")) index = 1;
        else if (Objects.equals(ruleKey, "name")) index = 2;
        for(List<String> s: items) {
            if(Objects.equals(s.get(index), ruleValue)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        CountItem count = new CountItem();
        // test cases too long. code is working fine.
        System.out.println();
    }
}
