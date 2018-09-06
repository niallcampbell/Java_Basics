
/**
 *  Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
 *  
 *  Solution:
 *  
 *  The solution to this is to simply copy the data from the next node into this node and then delete the next node.
 *  
 *  
 *  NOTE: This problem can not be solved if the node to be deleted is the last node in the linked list.
 *  
 *  Cracking the Coding Interview Q2.3
 *  
 */

public class deleteGivenNode
{
    public static boolean deleteNode(LinkedList list, Link n)
    {
        if(n == null || n.next == null)
        {
            return false;
        }
        else
        {
            Link nextLink = n.next;
            n.data = nextLink.data;
            n.next = nextLink.next;
            return true;
        }
    }
}
