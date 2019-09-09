import java.util.*;

/*This class contains a stack() method for implementing the LinkedStack class
 * It also contains the queue() method for implementing the LinkedQueue class
 * The BaseMenu() method is used to display the main menu of the program
 * The last method is the main() method, which is the entry point of the program
 */

public class MainMenu {
	
	Scanner scan=new Scanner(System.in);
	
	//stack method to group stack menu and operations
	public void stack(){
		
		/* Instantiating LinkedStack Object */   
        LinkedStack ls = new LinkedStack();
        
        /*Menu of Stack Operations*/
        System.out.println("\nMENU OPTION 1: STACK\n");  
        char ch1;     
        do 
        {
            System.out.println("Linked Stack Operations");
            System.out.println("1. Push a Student");
            System.out.println("2. Pop a Student");
            System.out.println("3. Display Students in Stack");
            System.out.println("4. Back to main menu");
        
            int choice1 = scan.nextInt();
            scan.nextLine();
            
            switch (choice1) 
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
            	BaseMenu();
                break;                
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }          
            System.out.println("\nType 'y' to continue or 'n' to exit \n");
            ch1 = scan.next().charAt(0);

        } while (ch1 == 'Y'|| ch1 == 'y'); 
	}
	
	
	//queue method to group queue menu and operations
	public void queue()
	{
		/* Instantiating LinkedQueue Object*/   

        LinkedQueue lq = new LinkedQueue();            
        /* Menu of Queue Operations*/    
        System.out.println("\nMENU OPTION 2: QUEUE\n"); 
        char ch2;
        do
        {
            System.out.println("Queue Operations");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Dequeue Student");
            System.out.println("3. Display Students in Queue");
            System.out.println("4. Back to Main Menu");

            int choice2 = scan.nextInt();
            scan.nextLine();
            
            switch (choice2)
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
            	BaseMenu();
               break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            System.out.println("\nType 'y' to continue or 'n' to exit \n");
            ch2 = scan.next().charAt(0);            
        } while (ch2 == 'Y'|| ch2 == 'y'); 
	}
	
	
	//BaseMenu method to contain main menu of program
	public void BaseMenu()
	{
		char ch;
	    do
	    {
	        System.out.println("\nStack n Queue Application");
	        System.out.println("1. Stack");
	        System.out.println("2. Queue");
	        System.out.println("3. Exit");
	 
	        int choice = scan.nextInt();
	        scan.nextLine();
	        
	        switch (choice)
	        {
	        case 1 : 
	        	
	        {
	            stack(); //calling stack() method to use a stack
	            break;
	        } 
	            
	        case 2 : 
	        {
	        	        
	        	queue(); //calling queue() method to use a queue
	            break;
	        }   
	            
	        case 3 : 
	        	System.out.println("Exiting the application...");
                System.exit(0);   //Terminate JVM
	        	break;
	        	
	        default : 
	            System.out.println("Wrong Entry \n ");
	            break;
	        }
	        
	        System.out.println("\n Type 'y' to continue or 'n' to exit) \n");
	        ch = scan.next().charAt(0);            
	    } while (ch == 'Y'|| ch == 'y');   
	}
	
	
   //main menu of program
   public static void main(String[] args)
   {
	   System.out.println("Welcome to Stack n Queue Application. Here you can push or pop a student's information using a stack");
	   System.out.println("Additionally, you can enqueue and dequeue a student's information");
	   System.out.println("In both cases, you can display the students in the container. Choose the appropriate menu item to continue");
	
	   //instantiating MainMenu object
	   MainMenu menu=new MainMenu();
	   //calling BaseMenu() method, which contains main menu
	   menu.BaseMenu();
		
   }
}