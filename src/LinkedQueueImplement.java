import java.util.Scanner;

 

/*  Class LinkedQueueImplement  */

public class LinkedQueueImplement

{    

    public static void main(String[] args)

    {

        Scanner scan = new Scanner(System.in); 

        /* Creating object of class linkedQueue */   

        linkedQueue lq = new linkedQueue();            

        /* Perform Queue Operations */    

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

                System.out.println("Enter ");

                lq.insert( scan.nextInt() );

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

                try

                {

                    System.out.println("Peek Element = "+ lq.peek());

                }

                catch (Exception e)

                {

                    System.out.println("Error : " + e.getMessage());

                }

                break;                         

            case 4 : 

                System.out.println("Empty status = "+ lq.isEmpty());

                break;

 

            case 5 : 

                System.out.println("Size = "+ lq.getSize());

                break;  

 

            default : 

                System.out.println("Wrong Entry \n ");

                break;

            }                

            /* display queue */        

            lq.display();

 

            System.out.println("\nDo you want to continue (Type y or n) \n");

            ch = scan.next().charAt(0);            

        } while (ch == 'Y'|| ch == 'y');                                                            

    } 
}