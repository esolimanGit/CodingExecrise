public class BinarySearch {
        public static int search(int[] arr, int target) {
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;

                // Check if x is present at mid
                if (arr[m] == target)
                    return m;

                // If x greater, ignore left half
                if (arr[m] < target)
                    l = m + 1;

                    // If x is smaller, ignore right half
                else
                    r = m - 1;
            }

            // If we reach here, then element was
            // not present
            return -1;
        }

        public static void main (String[] args){
            int[] nums = new int[]{-1,0,3,5,9,12};
            int target = 9;
            System.out.println(search(nums,target));
        }
}
