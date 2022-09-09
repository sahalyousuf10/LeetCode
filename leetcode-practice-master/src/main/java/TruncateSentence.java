// LeetCode: 1816. Truncate Sentence
import java.util.Arrays;

public class TruncateSentence {
    public String solution(String s, int k) {
        String[] stringArray = s.split(" ");
        String[] answer = new String[k];
        System.out.println(Arrays.toString(stringArray));
        for (int i = 0; i < k; i++) {
            answer[i] = stringArray[i];
        }
        return String.join(" ", answer);
    }
    public static void main(String[] args) {
        TruncateSentence truncate = new TruncateSentence();
        System.out.println(truncate.solution("This is A a sentence and this is incomplete.", 4));
        String[] testing = new String[5];
        System.out.println(Arrays.toString(testing));
    }
}
