import java.util.Scanner;
/* Class to implement LinkedStack. Has menu for operations on the linked
 * stack implementation
 */
public class LinkedStackImpl
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);   
        
        /* Instantiating LinkedStack Object */   
        LinkedStack ls = new LinkedStack();
        
        /*Menu of Stack Operations*/
        System.out.println("Option Number 1: Stack\n");  
        char ch;     
        do 
        {
            System.out.println("\nLinked Stack Operations");
            System.out.println("1. Push a Student");
            System.out.println("2. Pop a Student");
            System.out.println("3. Display Students in Stack");
            System.out.println("4. Back to main menu");
        
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
                
                ls.push(adminNumber, name, courseRegistered, courseUnits, address, guardian); 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Student = "+ ls.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
            	ls.display();
                break;                         
            case 4 : 

                
                break;                
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }          
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);

        } while (ch == 'Y'|| ch == 'y');                 
    }
}