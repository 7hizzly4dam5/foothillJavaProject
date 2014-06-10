public class ContactProgram
{
   public static void main(String[] args)
   {
      ContactList listOne = new ContactList();
      Contact personOne = new Contact();
      
      personOne.setFirstName("Albert");
      personOne.setLastName("Einstein");
      personOne.setEmail("eequalsmcsquared@physics.com");
      personOne.setStreet("1955 Eighteen April St");
      personOne.setState("New Jersey");
      personOne.setCity("Princeton");
      personOne.setZip("01905");
      personOne.setPhone("0299792458");
      personOne.setNotes("Above average intelligence");
      
      listOne.addContact(personOne);
      listOne.printContactList();
      listOne.findByLastName("Einstein");
      listOne.findByEmail("eequalsmcsquared@physics.com");
      listOne.findByZipCode("01905");
      
      System.out.println(personOne.toString());
      System.out.println(listOne.toString());
   }
}