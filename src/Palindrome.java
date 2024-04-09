import java.util.ArrayList;

public class Palindrome {

    public static void main(String[] args) {
        //[1,2,2,1]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))));
        //[1,2]
//        ListNode head = new ListNode(1, new ListNode(2, null));
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(head));
    }

    public boolean isPalindrome(ListNode head) {
        boolean result = true;
        ArrayList list = new ArrayList();
        while(head.next != null){
            list.add(head.val);
            head = head.next;
        }
        list.add(head.val);

        ArrayList secondHalf = new ArrayList(list.subList(list.size()/2, list.size()));
        for(int i = 0; i < secondHalf.size(); i++)
            if(list.get(i) != secondHalf.get(secondHalf.size() - i - 1))
                result = false;
        return result;
    }



}

