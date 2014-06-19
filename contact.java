/**
 * Creates a contact with fields for each piece of information.
 * 
 */
import java.util.Scanner;

public class Contact //TB, OC, EP, AB
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
      private boolean hasValidEmail() {
	   return (email.contains("@") && email.contains(".")) || email.length() == 0;
      }	   
      private boolean hasValidZip(){
	   return zip.length() == 5 || zip.length() == 0;
      }
      private boolean hasValidPhone(){
	   return phone.length() == 10 || phone.lenght == 0;
      }
      public void read()
   {
      Scanner scan = new Scanner(System.in);
	    
      System.out.print("First Name: ");
      first = scan.next();
      System.out.print("Last Name: ");
      last = scan.next();
      scan.useDelimiter(System.getProperty("line.separator"));
      do {//EP
	      System.out.print("Email: ");
	      email = scan.next();
	      if (hasValidEmail() == false) {
	    	  System.out.println("Invalid email. Please try again.");
	      }
      } while (hasValidEmail() == false);
      System.out.print("Street: ");
      street = scan.next();
      System.out.print("City: ");
      city = scan.next();
      System.out.print("State: ");
      state = scan.next();
      do {//EP
    	  System.out.print("Zipcode: ");
    	  zip = scan.next();
    	  if (hasValidZip() == false) {
    		  System.out.println("Invalid zipcode. Please try again.");
    	  }
      } while(hasValidZip() == false);
      do{//EP
    	  System.out.print("Phone Number: ");
    	  phone = scan.next();
    	  if (hasValidPhone() == false){
    		  System.out.println("Invalid phone. Please try again.");
    	  }
      } while (hasValidPhone() == false);
      System.out.print("Notes: ");
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
      return '\n' + "Name:"+  last + ", " + first + '\n' + "address" + street + '\n' + "City and State:"+ city + ", " + state +
      " " + "zip:"+ zip + '\n' + "email:"+ email + '\n' + "phone" + phone + '\n' + "notes:"+ notes;
   }
}
	
