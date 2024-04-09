import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static void main(String[] args){
        System.out.println(isPalindrome(-121));
//        int[] r = twoSum(new int[]{3,2,4}, 6);
//        for (int i : r)
//            System.out.print(i + " ");
        Result.UserTx s = new Result.UserTx(1,2);
        HashMap<Integer, Result.UserTx> users = new HashMap<Integer, Result.UserTx>();
        List<UserTx> usersList = new ArrayList<UserTx>();
        usersList.addAll(users.values());
        Collections.sort(usersList);
    }
    public static boolean isPalindrome(int x) {
        String sign = "";
        if (x < 0) sign = "-";
        StringBuilder str = new StringBuilder(sign + Math.abs(x));
        if (str.toString().equals(str.reverse().toString())) return true;
        else return false;
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++)
            numsMap.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            Integer diffIndex = numsMap.get(diff);
            if (diffIndex == null || diff == nums[i]) continue;
            else {
                results = new int[]{i, diffIndex};
                break;
            }
        }
        return results;
    }
}
