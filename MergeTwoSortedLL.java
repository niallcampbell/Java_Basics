
/**
 *  Code for merging two sorted linked lists
 */
public class MergeTwoSortedLL
{
    //given two heads of linked lists
    //return head of new merged list
    public static Link mergeSortedLL(Link head1, Link head2)
    {
        if(head1 == null && head2 == null)
        {
            return null;
        }
        else if(head1 == null)
        {
            return head2;
        }
        else if(head2 == null)
        {
            return head1;
        }
        
        Link current1 = head1;
        Link current2 = head2;
        
        int len1 = lengthGivenHead(current1);
        int len2 = lengthGivenHead(current2);
        
        int overallLen = len1 + len2;
        
        //Create a new linked list
        //We will add the nodes to this in order
        
        LinkedList myList = new LinkedList();
        
        int count = 0;
        
        while(count < overallLen)
        {
            if(current1 == null) //If there are no more nodes in list1
            {
                myList.add(current2.data);
                current2 = current2.next;
                count++;
            }
            else if(current2 == null) //If there are no more nodes in list2
            {
                myList.add(current1.data);
                current1 = current1.next;
                count++;
            }
            else if(current1.data <= current2.data) //add the lower value first
            {
                myList.add(current1.data);
                current1 = current1.next;
                count++;
            }
            else if(current2.data <= current1.data) //add the lower value first
            {
                myList.add(current2.data);
                current2 = current2.next;
                count++;
            }
        }
        
        return myList.head;
        
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
}
