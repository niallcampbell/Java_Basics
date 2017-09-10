
/**
 * 
 * The following code will create a link in a linked list in which each link contains a string and an int representing a name and an age respectively.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Link
{
    public String name;
    public int age;
    public Link next; //Each link will contain a pointer to the next link in the list
    
    
    /**
     * Constructor for objects of class Link
     */
    public Link(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    //Print a link
    public void printLink()
    {
        System.out.println("Name: " + name + " Age: " + age);
    }

    
}
