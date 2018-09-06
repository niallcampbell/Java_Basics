
/**
 * 
 * The following code will create a link in a linked list in which each link contains an int.
 * 
 */
public class Link
{
    public int data;
    public Link next; //Each link will contain a pointer to the next link in the list
    
    
    /**
     * Constructor for objects of class Link
     */
    public Link(int data)
    {
        this.data = data;
    }
    
    //Print a link
    public void printLink()
    {
        System.out.println("Data: " + data);
    }

    
}
