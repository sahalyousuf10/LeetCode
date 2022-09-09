//import java.util.ArrayList;
//import java.util.List;
//
//// LeetCode: 1588. Sum of All Odd Length Sub-arrays.
//public class SumOfSubArray {
//    public List<List<Integer>> solution(int[] arr) {
//        List<List<Integer>> myArray = new ArrayList<>();
//        int count = 1;
//
//        int start = 0;
//        int length = 1;
//        while(length < arr.length+1 && start < arr.length) {
//            List<Integer> subArray = new ArrayList<>();
//            if(length == arr.length) {
//                length = ;
//                start++;
//            }
//            for (int j = start; j < length; j++) {
//                subArray.add(arr[j]);
//            }
//            length += 2;
//            myArray.add(subArray);
//        }
//        return myArray;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,4,2,5,3};
//        SumOfSubArray array = new SumOfSubArray();
//        List<List<Integer>> answer = array.solution(arr);
//        System.out.println(answer.toString());
//    }
//}
