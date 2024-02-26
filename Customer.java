// Class: Customer
// Purpose: Represents a Customer and its attributes
//
// Tim Gallagher
// 2019 APCS A Facebook Summit

public class Customer
{  
	// Instance Variables
   private String lastName;     // A Customer's name
    private String firstName;     // A Customer's name
    private String name;
    private String initials;
   private int height;      // A Customer's height (in inches)
   	
   // Constructs a Customer
   public Customer(String ln, String fn, int h)
   {   
      lastName = ln;
      firstName = fn;
      height = h;
      name = fn + ln;
      initials = fn.substring(0,1)+ln.substring(0,1);
   }

   //Returns the Customer's name
   public String getName()
   {   
      return name;
   }
     //Returns the Customer's name
   public String getFirstName()
   {   
      return firstName;
   }
     //Returns the Customer's name
   public String getLastName()
   {   
      return lastName;
   }
     //Returns the Customer's name
   public String getInitials()
   {   
      return initials;
   }

   // Returns the Customer's height.
   public int getHeight()
   {   
      return height;
   }
  
   // String version of a Customer, padded to 12 characters
   public String toString()
   {
      String output = name + "," + height;
      for (int i=0; i< (12-name.length()); i++ )
         output = output + " ";
      return output;
   }

}