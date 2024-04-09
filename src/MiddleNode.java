import java.util.List;

public class MiddleNode {
    public static void main(String[] args) {
        MiddleNode node = new MiddleNode();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        System.out.println(node.middleNode(head));
    }
    public ListNode middleNode(ListNode head) {
        ListNode currNode = head;
        int count = 1;
        while(currNode.next != null){
            ++count;
            currNode = currNode.next;
        }
        int middleIndex = (count)/2 + 1;
        currNode = head;
        for(int i = 1 ; i < middleIndex; i++){
            currNode = currNode.next;
        }
        return currNode;
    }
}
