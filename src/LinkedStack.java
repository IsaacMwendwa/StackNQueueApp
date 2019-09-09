import java.util.*;

/*  Class LinkedStack implements the Node class, and contains methods 
 *   push() for adding a student, pop() for removing and display()
 *   to show all students in the stack
 */

class LinkedStack

{
    protected Node top ;
    protected int size ;

    /*  Constructor  */
    public LinkedStack()
    {
        top = null;
        size = 0;
    }    
    /*  Method to push a student to the stack */
    public void push(String a, String b, String c, String d, String e, String f)
    {
        Node nptr = new Node (a,b,c,d,e,f,null);
        if (top == null)
            top = nptr;
        else
        {
            nptr.setLink(top);
            top = nptr;
        }
        System.out.println("Student added");
        size++;
    }    
    /*  Method to pop a student from the stack */
    public String pop()
    {
        if (top==null )
            throw new NoSuchElementException("Underflow Exception") ;
        Node ptr = top;
        top = ptr.getLink();
        size--;
        return ptr.getName();
    }    
    /*  Method to display the students in the stack */
    public void display()
    {
        System.out.print("\nStack = ");
        if (size == 0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = top;
        while (ptr != null)
        {
        	System.out.println("Admin Number: "+ptr.getAdminNumber()+ " Name: "+ptr.getName()+" Course Registered: "+ ptr.getCourseRegistered()
        			+ " Course Units: "+ptr.getCourseUnits()+ " Address:" +ptr.getAddress()+ " Guardian: "+ptr.getGuardian());
            ptr = ptr.getLink();
        }
        System.out.println();        
    }
}