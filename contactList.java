/**
 * Creats an arraylist to store new contacts.
 */
import java.util.ArrayList;

public class ContactList //TB, OC
{
   
   private ArrayList<Contact> list;  // this data member holds a contact array
  
   /**
    * Default constructor for ContactList.  Creates an arraylist of Contacts.
    */
   ContactList()
   {
      list = new ArrayList<Contact>();
   }
   
   /**
    * This method adds an object of type Contact to the list that calls it.
    */
   public void addContact(Contact newPerson)
   {
      if (newPerson.getLast().isEmpty() == true)
      {
         newPerson = null;
      }
      else
      {
         /**
          * The Contact argument is added to the list at the location of count
          * , and then count moved to the next open spot
          */
         list.add(newPerson);
      }
   }
   

    
   public void searchByLastName()
   {
      System.out.println("Please enter last name of person you are searching for")
      String search = scanner.nextLine();
      for int i = 0; i < list.length(); i++) 
      {
         if (search == list[i].getLast())
         System.out.println(list[i])
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
}
