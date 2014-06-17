public class TestCaseOne
{
   public static void main(String[] args) //TB
   {
      
      ContactList listOne = new ContactList();  // 1) declare a list of contacts
      Contact personOne = new Contact();  // creates a new Person object
      personOne.read();  // prompts user input for Contact's fields.
      
      listOne.addContact(personOne);  // 2) add one contact to the list
      listOne.printList();  // 3) print the list to show the contact  is on it
      
      Contact personTwo = new Contact();  //creates another Contact
      personTwo.read();  //prompts user input for Contact fields
      
      listOne.addContact(personTwo);  // 4) add another contact to the list
      listOne.printList();  // 5) print the list to show both contacts are on it
   }
}

/************************************TEST RUN**********************************

Toms-MacBook-Air-2:caseOneFinal Bleezy$ java TestCaseOne
First Name:John
Last Name:MacEnroe
Email:jMac@gmail.com
Street:123 Tennis Street
City:San Jose
State:CA
Zipcode:90123
Phone Number:(123) 456-7890
Notes:This is a note 
MacEnroe, John
123 Tennis Street
San Jose, CA 90123
jMac@gmail.com
(123) 456-7890
This is a note
First Name:Mary
Last Name:Lamb
Email:maryHasLambs@gmail.com
Street:456 Sheppard Street
City:Dover
State:Rhode Island
Zipcode:12345
Phone Number:(987) 654-3210
Notes:This is the second note
MacEnroe, John
123 Tennis Street
San Jose, CA 90123
jMac@gmail.com
(123) 456-7890
This is a note
Lamb, Mary
456 Sheppard Street
Dover, Rhode Island 12345
maryHasLambs@gmail.com
(987) 654-3210
This is the second note

*****************************************************************/
