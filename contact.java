import java.util.Scanner;

public class Contact
{
 
   private String first;
   private String last;
   private String street;  
   private String city;  
   private String zip;
   private String state;
   private String email;
   private String phone;
   private String notes; 
   
   
   Contact()
   {
      first = "default";
      last = "default";
      email = "default";
      phone = "default";
      street = "default";
      city = "default";
      state = "default";
      zip = "default";
      notes = "default";
   }
   
   public void read()
   {
      Scanner scan = new Scanner(System.in);
	    
      System.out.print("First Name:");
      first = scan.next();
      System.out.print("Last Name:");
      last = scan.next();
      scan.useDelimiter(System.getProperty("line.separator"));
      System.out.print("Email:");
      email = scan.next();
      System.out.print("Street");
      street = scan.next();
      System.out.print("City:");
      city = scan.next();
      System.out.print("State:");
      state = scan.next();
      System.out.print("Zipcode:");
      zip = scan.next();
      System.out.print("Phone Number:");
      phone = scan.next();
      System.out.print("Notes:");
      notes = scan.next(); 
   }
	   
	 
   public String getFirst()
   {
      return first;
   }
   
   public String getLast()
   {
      return last;
   }
	
   public String getStreet()
   {
      return street;
   }
	
   public String getCity()
   {
      return city;
   }
   
   public String getZip()
   {
      return zip;
   }
   
   public String getState()
   {
      return state;
   }
   
   public String getEmail()
   {
      return email;
   }
	
   public String getPhone()
   {
      return phone;
   }
	
   public String getNotes()
   {
      return notes;
   }
	
   public String toString()
   {
      return last + ", " + first + '\n' + street + '\n'+ city + ", " + state +
      " " + zip + '\n' + email + '\n' + phone + '\n' + notes;
   }
}
	
