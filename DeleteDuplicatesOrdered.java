
/**
 *   Code for deleting duplicate nodes from an ordered linked list. 
 */
public class DeleteDuplicatesOrdered
{
    public static LinkedList deleteDuplicates(LinkedList myList)
    {
        Link current = myList.head;
        Link next = null;
        
        if(current == null)
        {
            return null;
        }
        
        while(current.next != null)
        {
            if(current.data == current.next.data)
            {
                next = current.next.next;
                current.next = next; //bypass the node as it is a duplicate
            }
            else
            {
                current = next; //move on
            }
        }
        
        return myList;
    }
    
    
    public static void main()
    {
        LinkedList myList = new LinkedList();
        
        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        
        myList = deleteDuplicates(myList);
        
        myList.printList();
    }
}
