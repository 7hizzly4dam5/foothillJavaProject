public class ContactList
{
   
   private Contact[] list;  // this data member holds a contact array
   private int count;  //this data member keeps track of how
                                   //how full the list is.
   /**
    * Default constructor for ContactList.  Creates an array of Contacts that is
    * able to hold 40 Contacts
    */
   ContactList()
   {
      list = new Contact[40];
      count = 0;
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
      for  (int i = 0; i < count; i++)
      {
         System.out.println(list[i].toString());
      }
      
   }
}
