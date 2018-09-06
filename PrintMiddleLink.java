
/**
 *  Code that finds and prints the middle link of a LinkedList
 *  
 *  
 */
public class PrintMiddleLink
{
    public static void printMiddleLink(LinkedList list)
    {
        //Find the lenght of the linked list
        
        int length = linkedListLength(list); 
        
        int middle = 0;
        
        if(length % 2 == 0) //even length
        {
            middle = length / 2;
        }
        else if(length % 2 != 0) //odd length
        {
            middle = (length / 2) + 1;
        }
        
        Link temp = list.head;
        
        for(int i = 1; i < middle; i++)
        {
            temp = temp.next;
        }
        
        System.out.print("Value of middle link = " + temp.data);
        
        
    }
    
    
    public static int linkedListLength(LinkedList list)
    {
        Link temp = list.head;
        
        int count = 0; //stores the length of the linked list
        
        if(temp == null)
        {
            return count;
        }
        
        //Loop through the elements in the list
        while(temp.next != null)
        {
            count++;
            temp = temp.next;
        }
        
        count++; //include the last link in the list
        
        return count;
    }
    
    
    public static void main()
    {
        LinkedList list = new LinkedList(); 
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //list.add(5); 
        
        printMiddleLink(list); 
    }
    
}
