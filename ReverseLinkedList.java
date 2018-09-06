
/**
 *  Code for reversing a linked list. 
 *  
 */
public class ReverseLinkedList
{
    //Returns the head of the reversed linked list
    public static Link reverse(Link head)
    {
        if(head == null)
        {
            return null;
        }
        
        Link current = head;
        Link next = null;
        Link prev = null;
        
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        head = prev;
        
        return head;
    }

}
