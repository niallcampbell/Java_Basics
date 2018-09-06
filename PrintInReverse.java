
/**
 *  Code to print a linkedlistin reverse
 */
public class PrintInReverse
{
    public static void printInReverse(Link head)
    {
        Link current = head;
        
        if(current.next == null) //at the end of the list
        {
            System.out.println(current.data);
            return;
        }
        
        printInReverse(current.next);
        System.out.println(current.data);
    }
    
    
    public static void main()
    {
        LinkedList myList = new LinkedList();
        
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        
        printInReverse(myList.head);
    }
}
