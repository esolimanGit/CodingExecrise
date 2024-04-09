import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Playground {

    public static void main(String[] args){
//       System.out.println(findMissing(Arrays.asList(1,2,3,4,6)));

    }

    public static ListNode mergeSortedList(ListNode l1, ListNode l2){
        ListNode tempNode = new ListNode(0);
        ListNode currentNode = tempNode;

        while( l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                currentNode.next = l1;
                l1 = l1.next;
            }
            if (l1.val > l2.val) {
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }

        if(l1 == null){
            currentNode.next = l2;
            l2 = l2.next;
        }
        if(l2 == null) {
            currentNode.next = l1;
            l1 = l1.next;
        }

        return tempNode.next;
    }
    public static int findMissing(List<Integer> nums){
        HashSet<Integer> numSet = new HashSet<Integer>();
        for (int i = 1; i <= nums.size() + 1 ; i++) {
            numSet.add(i);
        }
        for (int i = 0; i < nums.size(); i++){
            numSet.remove(nums.get(i));
        }

        return (int)numSet.toArray()[0];
    }
}
