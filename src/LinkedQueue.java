 import java.util.*;

 /* Class LinkedQueue implements the Node class, and contains
 * methods insert() to queue a student, remove() to dequeue, 
 * and display() to display the students in the queue
 */

class LinkedQueue
{
    protected Node front, rear;
    public int size;

    /* Constructor */
    public LinkedQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }    
    /*  Method to insert a student to the queue */
    public void insert(String a, String b, String c, String d, String e, String f)
    {
        Node nptr = new Node(a,b,c,d,e,f, null);
        if (rear == null)
        {
            front = nptr;
            rear = nptr;
        }
        else
        {
            rear.setLink(nptr);
            rear = rear.getLink();
        }
        size++;
        System.out.println("Student Added");
    }    
    /*  Method to remove front student from the queue */
    public String remove()
    {
        if (front==rear )
            throw new NoSuchElementException("Underflow Exception");
        Node ptr = front;
        front = ptr.getLink();        
        if (front == null)
            rear = null;
        size-- ; 
        System.out.println("Student Removed");
        return ptr.getName();
    }
    /*  Method to display the students in the queue */
    public void display()
    {
        System.out.print("\nQueue = ");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = front;
        while (ptr != rear.getLink() )
        {
        	System.out.println("Admin Number: "+ptr.getAdminNumber()+ " Name: "+ptr.getName()+" Course Registered: "+ ptr.getCourseRegistered()
        			+ " Course Units: "+ptr.getCourseUnits()+ " Address:" +ptr.getAddress()+ " Guardian: "+ptr.getGuardian());
            ptr = ptr.getLink();
        }
        System.out.println();        
    }
}