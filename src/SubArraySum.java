import java.util.ArrayList;

public class SubArraySum {
        //Function to find a continuous sub-array which adds up to a given number.
        static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
        {
            int currentSum = 0;
            int startIndex = 0;
            ArrayList<Integer> result = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                //if current element equal to the sum, then return the current index.
                if(arr[i] == s){
                    result.add(i+1);
                    result.add(i+1);
                    return result;
                }
                if(arr[i] > s) {
                    currentSum = 0;
                    startIndex = i+1;
                    continue;
                }
                if(arr[i] < s) {
                    currentSum += arr[i];
                }
                while(currentSum > s) {
                    currentSum = currentSum - arr[startIndex];
                    startIndex++;
                }
                if(currentSum == s) {
                    result.add(startIndex + 1);
                    result.add(i + 1);
                    return result;
                }

            }
            if(result.isEmpty()) result.add(-1);
            return result;
        }

        public static void main(String args[]) {
//        int input[] = {1,16,1,2,3,4,5,6,7,8,9,10};
//        int input[] = {1,2,3,7,5};
//        int input[] = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
//        subarraySum(new int[]{1,2,3,7,5},5, 12).forEach(x ->System.out.print(x + " "));
            System.out.println();
//        subarraySum(new int[]{135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134},50, 486).forEach(x ->System.out.print(x + " "));
            subarraySum(new int[]{142, 112, 54, 69, 148, 45, 63, 158, 38, 60, 124, 142, 130, 179, 117, 36, 191, 43, 89, 107, 41, 143, 65, 49, 47, 6, 91, 130, 171, 151, 7, 102, 194, 149, 30, 24, 85, 155, 157, 41, 167, 177, 132, 109, 145, 40, 27, 124, 138, 139, 119, 83, 130, 142, 34, 116, 40, 59, 105, 131, 178, 107, 74, 187, 22, 146, 125, 73, 71, 30, 178, 174, 98, 113}, 74, 665).forEach(x -> System.out.print(x + " "));
        }
}
