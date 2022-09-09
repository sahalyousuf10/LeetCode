// leetcode 2011
public class FourOperationLanguage {
    public int solution(String[] operations) {
        int answer = 0;
        for(String x: operations) {
            switch(x){
                case "++X":
                case "X++":
                    answer++;
                    break;
                case "--X":
                case "X--":
                    answer--;
                    break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        FourOperationLanguage four = new FourOperationLanguage();
        int ans = four.solution(operations);
        System.out.println(ans);
    }
}
