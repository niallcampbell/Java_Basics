
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main()
    {
        LinkedList myList = new LinkedList();
    
        myList.add("Niall", 23);
        myList.add("Alan", 25);
        myList.add("Paul", 35);
        myList.addFirst("Kenny", 40);
        
        myList.printList();
        
        myList.delete("Paul", 35);
        
        myList.printList();
    }
}
