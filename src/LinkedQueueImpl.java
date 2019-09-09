import java.util.*;
/*  Class Linke  */

public class LinkedQueueImpl
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); 
        /* Instantiating LinkedQueue Object*/   

        LinkedQueue lq = new LinkedQueue();            
        /* Menu of Queue Operations*/    
        System.out.println("Linked Queue Test\n"); 
        char ch;
        do
        {
            System.out.println("\nQueue Operations");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Dequeue Student");
            System.out.println("3. Display Students in Queue");
            System.out.println("4. Back to Main Menu");

            int choice = scan.nextInt();
            scan.nextLine();
            
            switch (choice)
            {
            case 1 : 
            	 System.out.println("Enter Student Details:");
                 System.out.print("Enter administration number: ");
                 String adminNumber=scan.nextLine();
                 System.out.print("Enter Your Name: ");
                 String name=scan.nextLine();
                 System.out.print("Enter Course Registered: ");
                 String courseRegistered=scan.nextLine();
                 System.out.print("Enter Course Units: ");
                 String courseUnits=scan.nextLine();
                 System.out.print("Enter Address: ");
                 String address=scan.nextLine();
                 System.out.print("Enter Name of Guardian: ");
                 String guardian=scan.nextLine();
                 
                lq.insert(adminNumber, name, courseRegistered, courseUnits, address, guardian); 
                break;                         
            case 2 : 
                try 
                {
                    System.out.println("Removed Element = "+ lq.remove());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
               lq.display();
               break;
            case 4 : 

               
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);            
        } while (ch == 'Y'|| ch == 'y');                                                            
    } 
}