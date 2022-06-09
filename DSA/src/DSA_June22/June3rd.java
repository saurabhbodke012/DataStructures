package DSA_June22;

public class June3rd {

    public static June2nd.ListNode reverseList(June2nd.ListNode head) {

        June2nd.ListNode current = head;
        June2nd.ListNode previous = null;

        while(current!= null){
            June2nd.ListNode next = current.next;
            current.next= previous;
            previous= current;
            current= next;
        }

        return previous;
    }


}
