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
      if (newPerson.last.isEmpty() == true || count ==40)
      {
      }
      else
      {
         list[count] = newPerson;   //The new contact is stored in the next
         count+=1;                            //available spot of the array.
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
