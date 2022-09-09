// LeetCode 14
public class CommonPrefix {
    public String solution(String[] strs) {
        String minString = strs[0];
        StringBuilder answer = new StringBuilder();
        for(String x: strs) {
            if (x.length() < minString.length()) {
                minString = x;
            }
        }
        for(int i = 0; i < minString.length(); i++){
            for(String x: strs) {
                if(x.charAt(i) != minString.charAt(i)) {
                    return answer.toString();
                }
            }
            answer.append(minString.charAt(i));
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        CommonPrefix prefix = new CommonPrefix();
        String[] myString = {"ytyytytieow","ytyytytieowflow","ytyytytieowflight","ytyytytieow",""};
        System.out.println(prefix.solution(myString));
    }
}
