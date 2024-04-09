public class MaxSumRectangle {

    static int maximumSumRectangle(int R, int C, int M[][]) {
        int sum = Integer.MIN_VALUE;
        for(int x = 0; x < R ; x++)
            for(int y = 0; y < C ; y++){
                int pointSum = getMaxForEachCell(x, y, R, C, M);
                if(pointSum> sum) sum = pointSum;
                // move x only till c
                // move y only till r
                // move both x till c - 1 and y till r - 1

            }
        return sum;
    }

    static int getMaxForEachCell(int x, int y, int R, int C, int M[][]){
        int xSum = 0;
        int ySum = 0;
        // x is fixed and y is changing
        for (int j = y; j < C-1; j++) {
            if (M[x][j] + xSum > xSum) xSum += M[x][j];
            // y is fixed and x is changing
            for (int i = x; i < R - 1; i++)
                if (M[i][y] + ySum > ySum) ySum += M[i][y];
        }
        if(xSum > ySum) return xSum; else return ySum;

    }
    public static void main(String[] args){
        int R=4, C=5;
        int[][] M=new int[][]{
                {1,2,-1,-4,-20},
                {-8,-3,4,2,1},
                {3,8,10,1,3},
                {-4,-1,1,7,-6}};

        System.out.print(maximumSumRectangle(R, C, M));
    }
}
