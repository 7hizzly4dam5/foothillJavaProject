/** 
 * A representation of a contact with fields for each piece of information and getters/setters for each field.
 * 
 */
public class Contact
{
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String zip;
	private String state;
	private String email;
	private String phone;
	private String notes;
	
	/**
	* Returns the variable firstName
	*/
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	* Sets the variable firstName
	*/
	public void setFirstName(String newFirstName)
	{
		firstName = newFirstName;
	}
	
	/**
	* Returns the variable lastName
	*/
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	* Sets the variable lastName
	*/
	public void setLastName(String newLastName)
	{
		lastName = newLastName;
	}
	
	/**
	* Returns the variable street
	*/
	public String getStreet()
	{
		return street;
	}
	
	/**
	* Sets the variable street
	*/
	public void setStreet(String newStreet)
	{
		street = newStreet;
	}
	
	/**
	* Returns the variable city
	*/
	public String getCity()
	{
		return city;
	}
	
	/**
	* Sets the variable city
	*/
	public void setCity(String newCity)
	{
		city = newCity;
	}
	
	/**
	* Returns the variable zip
	*/
	public String getZip()
	{
		return zip;
	}
	
	/**
	* Sets the variable zip
	*/
	public void setZip(String newZip)
	{
		zip = newZip;
	}
	
	/**
	* Returns the variable state
	*/
	public String getState()
	{
		return state;
	}
	
	/**
	* Sets the variable state
	*/
	public void setState(String newState)
	{
		state = newState;
	}
	
	/**
	* Returns the variable email
	*/
	public String getEmail()
	{
		return email;
	}
	
	/**
	* Sets the variable email
	*/
	public void setEmail(String newEmail)   //added by EP
	{
		email = newEmail;
	}
	
	/**
	* Returns the variable phone
	*/
	public String getPhone()
	{
		return phone;
	}
	
	/**
	* Sets the variable phone
	*/
	public void setPhone(String newPhone)
	{
		phone = newPhone;
	}
	
	/**
	* Returns the variable notes
	*/
	public String getNotes()
	{
		return notes;
	}
	
	/**
	* Sets the variable notes
	*/
	public void setNotes(String newNotes)
	{
		notes = newNotes;
	}
	
	/**
	* Converts the instance of Contact into a string readable by the user as a summary of information about
	* the specific contact.
	*/
	public String toString()
	{
		;
	}
}