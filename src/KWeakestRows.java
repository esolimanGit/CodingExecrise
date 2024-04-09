import java.util.Arrays;

public class KWeakestRows {

    public static void main(String[] args) {
        KWeakestRows kWeakestRows = new KWeakestRows();
        int[][] input = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        kWeakestRows.kWeakestRows(input, 3);
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] arr = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            arr[i] = sum;

        }
        printArray(arr);

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
            printArray(arr);
        return result;
    }


    public void printArray(int[] x) {
        for (int i = 0; i < x.length; i++)
            System.out.println(x[i]);
    }
}
