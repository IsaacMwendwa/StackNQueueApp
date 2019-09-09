
 
/*  Class Node contains a representation of the nodes of the linked-list data structure
 * It also contains accessor and mutator methods for setting and getting the instance variables
 */

class Node

{
    //instance variables to hold student information
    protected String adminNumber;
    protected String name;
    protected String courseRegistered;
    protected String courseUnits;
    protected String address;
    protected String guardian;
    
   //instance variable to point to next node
    protected Node link;
    
    /*Default  Constructor  */
    public Node()
    {
        adminNumber="";
        name="";
        courseRegistered="";
        courseUnits="";
        address="";
        guardian="";
       
        link=null;
    }

    /*Parametized  Constructor  */
    public Node(String a,String b,String c, String d, String e, String f, Node n)
    {
    	adminNumber = a;
        name = b;
        courseRegistered = c;
        courseUnits = d;
        address = e;
        guardian = f;
        
        link = n;
    }    

    /* Method to set link to next Node  */
    public void setLink(Node n)
    {
        link = n;
    }    

    /*  Mutator method to set Student Information  */
    public void setStudentInfo(String a,String b,String c, String d, String e, String f)
    {
    	adminNumber = a;
        name = b;
        courseRegistered = c;
        courseUnits = d;
        address = e;
        guardian = f;
    }    

    /*  Getter method to get link to next node  */
    public Node getLink()
    {
        return link;
    }    

    /*  Getter methods to return student information  */
    public String getAdminNumber()
    {
        return adminNumber;
    }
    public String getName()
    {
        return name;
    }
    public String getCourseRegistered()
    {
        return courseRegistered;
    }
    public String getCourseUnits()
    {
        return courseUnits;
    }
    public String getAddress()
    {
        return address;
    }
    public String getGuardian()
    {
        return guardian;
    }
   
}