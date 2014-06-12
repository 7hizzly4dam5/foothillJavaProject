import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      //creates a new ContactList
      ContactList contacts = new ContactList();
      
      int userInput;  //this int holds user's input
      Scanner scan = new Scanner(System.in);
      
      /**
       * This do-while loop displays the menu initially, and then continues to
       * display the menu until the user selects 3 to quit
       */
      do  {
         
         System.out.println("Welcome to the QuickSoft Database.");
         System.out.println("Menu:\n1 - Add Contact\n2 - Print list");
         System.out.println("3 - Save and Exit");
         
         //user enters their menu choice
         userInput = scan.nextInt();
         
      }  while (userInput !=3);
      { 
         switch (userInput)
         {
         case 1:  contacts.addContact();
            break;
         case 2: contacts.printList();
            break;
         default:  System.out.println("Error: INVALID ENTRY");
            break;
         }
         
         System.out.println("Welcome to the QuickSoft Database.");
         System.out.println("Menu:\n1 - Add Contact\n2 - Print list");
         System.out.println("3 - Save and Exit");
         
         userInput = scan.nextInt();
      }
   System.out.println("Thankyou for using QuickSoft");
   }
}
         
      
      
      
      
      /**Contact personOne = new Contact();
      personOne.read();
      Contact personTwo = new Contact();
      personTwo.read();
      
      System.out.println("Now the contact list prints");
      ContactList contacts = new ContactList();
      contacts.addContact(personOne);
      contacts.addContact(personTwo);
      contacts.printList();
      */
