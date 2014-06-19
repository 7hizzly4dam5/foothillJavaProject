import java.util.Scanner;
import java.io.*;

public class ContactList //TB, OC
{
   Scanner scan =new Scanner(System.in);
   
   private final int CONTACT_TOTAL = 20;
   
   private Contact[] list;  
   private int count;  
                                   
                                   
   private Contact[] lMatch;
   private int lcount;
   
   private Contact[] eMatch;
   private int ecount;
   
   private Contact[] zMatch;
   private int zcount;
  
   /**
    * Default constructor for ContactList.  Creates an arraylist of Contacts.
    */
   ContactList()
   {
      list = new Contact[CONTACT_TOTAL];
      lMatch = new Contact[CONTACT_TOTAL];
      eMatch = new Contact[CONTACT_TOTAL];
      zMatch = new Contact[CONTACT_TOTAL];
      count = 0;
      lcount = 0;
      ecount = 0;
      zcount = 0;
   }
   
   /**
    * This method returns the current length of the ContactList array list
    * */
   
   public int getCount()
   {
      return count;
   }
   
   /**
    * This method returns the list of Contacts
    * */
   public Contact[] getList()
   {
      return list;
   }
   /**
    * This method adds an object of type Contact to the list that calls it.
    */
   public void addContact(Contact newPerson)
   {
      /**
          * The Contact argument is added to the list at the location of count
          * , and then count moved to the next open spot
          */
         list[count] = newPerson;   
         count+=1;               
      }
   }
   
    /**
    * This method prints all of the contacts stored in the list by calling the
    * toString() method for that Contact object
    */
   public void printList()
   {
      for  (int i = 0; i < list.size() ; i++)
      {
         System.out.println(list.get(i).toString());
      }
      
   }
   
    public void lastAccess()
   {
      System.out.println("\nEnter a last name address to search:");
      
      //creates Scanner object to accept input, assigns to String search
      Scanner scan = new Scanner(System.in);
      String search;
      search = new String(scan.next());
      
      //adds all matching las names to the lMatch contact array
      for (int i = 0; i < count; i++)
      {
         String lastCheck;
         lastCheck = list[i].getLast();  //current last name is the contactsearc
         
         if (search.equals(lastCheck))
         {
            lMatch[lcount] = list[i];
            lcount+=1;
         }
      }
      
      //print all of the contacts with matching last names
      for (int i = 0; i < lcount; i++)
      {
         System.out.println(lMatch[i].toString());
      }
   }
   
   public void emailAccess()
   {
      
      System.out.println("\nEnter an email address to search:");
      //creates Scanner object to accept input, assigns to String search
      Scanner scan = new Scanner(System.in);
      String search;
      search = new String(scan.next());
      
      //adds all matching las names to the lMatch contact array
      for (int i = 0; i < count; i++)
      {
         String emailCheck;
         emailCheck = list[i].getEmail();  //current last name is the contactsearc
         
         if (search.equals(emailCheck))
         {
            eMatch[ecount] = list[i];
            ecount+=1;
         }
      }
      
      //print all of the contacts with matching last names
      for (int i = 0; i < ecount; i++)
      {
         System.out.println(eMatch[i].toString());
      }
   }
   
   public void zipAccess()
   {
      System.out.println("\nEnter a Zipcode to search:");
      //creates Scanner object to accept input, assigns to String search
      Scanner scan = new Scanner(System.in);
      String search;
      search = new String(scan.next());
      
      //adds all matching las names to the lMatch contact array
      for (int i = 0; i < count; i++)
      {
         String zipCheck;
         zipCheck = list[i].getZip();  //current last name is the contactsearc
         
         if (search.equals(zipCheck))
         {
            zMatch[zcount] = list[i];
            zcount+=1;
         }
      }
      
      //print all of the contacts with matching last names
      for (int i = 0; i < zcount; i++)
      {
         System.out.println(zMatch[i].toString());
      }
   }
}
}
