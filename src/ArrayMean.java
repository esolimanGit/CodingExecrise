import java.util.ArrayList;

public class ArrayMean {
    public static ArrayList<Integer> findMean(int arr[], int queries[], int n, int q){
        ArrayList<Integer> result = new ArrayList<Integer>();
        // get mean for each query
        int i = 0;
        while(i<q){
            int startIndex = i*2, endIndex = startIndex + 1;
            System.out.println("startIndex: " + startIndex);
            System.out.println("endIndex: " + endIndex);
            int count = queries[endIndex] - queries[startIndex] + 1;
            int querySum = 0;
            for(int j = 0; j < count; j++){
                querySum += arr[j + queries[startIndex]];
            }
            result.add(querySum/count);
            i++;
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] queries = {0,2,1,3,0,4};
        //findMean(arr, queries,5,3 ).forEach(x -> System.out.print(x));

        findMean(new int[]{2,4,8,1,9,5,4,6,3,3}, new int[]{0,8},10,1 ).forEach(x -> System.out.print(x));


    }
}
