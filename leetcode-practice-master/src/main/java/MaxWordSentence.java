// leetcode 2114
public class MaxWordSentence {
    public int solution(String[] sentences){
        int max = 0;
        for(String x: sentences) {
            int count = 0;
            for (int i = 0; i < x.length(); i++) {
                if((int) x.charAt(i) == 32) {
                    count++;
                }
            }
            if(count> max) {
                max = count;
            }
        }
        return max + 1;
    }
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode sdf sdf", "i think so too", "this is great thanks very much"};
        MaxWordSentence max = new MaxWordSentence();
        int answer = max.solution(sentences);
        System.out.println(answer);
    }
}
