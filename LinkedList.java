
/**
 * The following code will create a linked list in which each link contains an int.
 * 
 */
public class LinkedList
{
    public Link head; //This will point to the head of the linked list, i.e. the first element
    
    /**
     * Constructor for objects of class LinkedList
     */
    public LinkedList()
    {
        head = null;
    }

    //Returns true if list is empty
    public boolean isEmpty()
    {
        return head == null;
    }
    
    
    //Insert element into the end of the linked list
    public void add(int data)
    {
        Link myLink = new Link(data);
        
        //Check if list is empty
        if(isEmpty())
        {
            //There is nothing in the list so this link becomes the head
            head = myLink;
        }
        else
        {
            Link temp = head; // start with the first node
            
            //Loop through each node until the last one points to nothing
            while (temp.next != null)
            {
               temp = temp.next;
            }
            
            temp.next = myLink;
        }
    }
    
    
    //Add element to the beginning of the list
    public void addFirst(int data)
    {
        Link myLink = new Link(data); //Create the new link
        
        if(isEmpty())
        {
            //There is nothing in the list so this link becomes the head
            head = myLink;
        }
        else
        {
            myLink.next = head;
            
            head = myLink;
        }
    }
    
    
    //Delete specific element from list
    public void delete(int data)
    {
        Link del = new Link(data);
        
        //If it is the head of the list that needs to be deleted
        if(head.data == del.data)
        {
            head = head.next;
        }
        
        //It is not the head to be deleted so check the rest of the nodes
        //Loop through the list and see if any of the nodes match this one
        
        Link currentNode = head.next; //Move to the next node after the head
        Link previousNode = head; 
            
        //Loop through each node until the last one points to nothing
        while (currentNode.next != null)
        {
            if(currentNode.data == del.data)
            {
                previousNode.next = currentNode.next;
                return;
            }
            else
            {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        
        //If the link has not been found yet, check if it is the tail of the list that needs to be deleted
        if(currentNode.data == del.data)
        {
            previousNode.next = null;
        }
    }
    
    
    //Print the linked list
    public void printList()
    {
        Link currentLink = head;
        System.out.println("List: ");
        
        while(currentLink != null)
        {
            currentLink.printLink();
            currentLink = currentLink.next;
        }
        
    }
    
    
    //Return length of Linked list
    public int length()
    {
        int count = 0;
        
        if(isEmpty())
        {
            return count;
        }
        else
        {
            Link temp = head; // start with the first node
            
            //Loop through each node until the last one points to nothing
            while (temp.next != null)
            {
               count++;
               temp = temp.next;
            }
            
            count++; //Include the last link in the count
            return count;
        }
    }
    
}
