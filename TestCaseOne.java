/**
 * This class creates a list of contacts and individual objects of contact.  
 * It then prints the list of contacts after each entry.
 */
import java.util.Scanner;
import java.io.*;

public class TestCaseOne
{
   public static void main(String[] args) throws java.io.IOException
   , java.lang.ClassNotFoundException
   {
      Boolean sentinel;
         
      do
      {
         sentinel = false;
         Scanner scan = new Scanner(System.in);
         System.out.println("1-Add Contact\n2-Print List\n3- Last Search" + '\n'
                            +"4-Email Search\n5- Zip Search\n6- Save & Quit");
         int userIn = scan.nextInt();
         
         
         switch(userIn) {
            case 1: Contact contact = new Contact();
               contact.read();
               listOne.addContact(contact);
               sentinel = true;
               break;
            case 2: listOne.printList(); sentinel = true;
               break;
            case 3: listOne.lastAccess(); sentinel = true;
               break;
            case 4: listOne.emailAccess(); sentinel = true;
               break;
            case 5: listOne.zipAccess(); sentinel = true;
               break;
            case 6: sentinel = false;
               break;
         }
      }
      while(sentinel);
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
