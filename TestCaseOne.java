public class TestCaseOne
{
   public static void main(String[] args)
   {
      
      Contact personOne = new Contact();
      personOne.read();
      
      ContactList listOne = new ContactList();
      listOne.addContact(personOne);
      listOne.printList();
      
      Contact personTwo = new Contact();
      personTwo.read();
      
      listOne.addContact(personTwo);
      listOne.printList();
   }
}
      
      /**
      1) declare a list of contacts

2) add one contact to the list

3) print the list to show that the contact got into the list

4) add another contact to the list

5) print the list to show that both contacts got into the list

If your main() does more than just these 5 steps, 
then you are on the wrong track.

As you code this first use case, be careful not to change the design that your director approved in Task 2.
At this point you may need to add additional methods or functions, but you should not add any new 
variables (unless your director asked you to add a new variable in your feedback from Task 2.)
*/
