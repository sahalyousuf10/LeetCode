// leetcode 1672
public class RichestCustomer {
    public int solution(int[][] accounts) {
        int max = 0;
        for(int[] x: accounts) {
            int sum = 0;
            for (int j : x) {
                sum += j;
            }
            if (sum>max) {
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{3,1,1}};
        RichestCustomer customer = new RichestCustomer();
        System.out.println(customer.solution(nums));
    }
}
