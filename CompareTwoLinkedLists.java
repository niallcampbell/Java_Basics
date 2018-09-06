
/**
 *  Code for comparing two linked lists to see if they are the same
 */
public class CompareTwoLinkedLists
{
    //Given the heads of two linked lists
    //returns true if the lists are the same, false otherwise
    public static boolean compareLL(Link head1, Link head2)
    {
        if(head1 == null && head2 == null)
        {
            return true;
        }
        else if(head1 != null && head2 == null)
        {
            return false;
        }
        else if(head1 == null && head2 != null)
        {
            return false;
        }
        
        int len1 = lengthGivenHead(head1);
        int len2 = lengthGivenHead(head2);
        
        if(len1 != len2)
        {
            return false;
        }
        
        int count = 0;
        
        Link temp1 = head1;
        Link temp2 = head2;
        
        while(count < len1)
        {
            if(temp1.data != temp2.data)
            {
                return false;
            }
            else
            {
                temp1 = temp1.next;
                temp2 = temp2.next;
                count++;
            }
        }
        
        return true;
        
    }
    
    //returns the length of a linked list when given its head
    public static int lengthGivenHead(Link head)
    {
        Link temp = head;
        
        int count = 0;
        
        while(temp.next != null)
        {
            count++;
            temp = temp.next;
        }
        
        count++; //include the last link
        
        return count;
    }
    
    //Test the code
    public static void main()
    {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        
        System.out.println(compareLL(list1.head, list2.head));
        
        list1.add(4);
        list2.add(5);
        
        System.out.println(compareLL(list1.head, list2.head));
    }
}
