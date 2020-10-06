/**
 * 
 */

/**
 * @author LPOTT
 *
 */
import java.util.*;
 class Person {
		String Name;
		String Telephone;
		String Email_address;
		String Physical_Address;

	public Person(String name2, String telephone2, String email_address2, String physical_Address2) {
		// TODO Auto-generated constructor stub
		Name = name2;
		Telephone = telephone2;
		Email_address = email_address2;
		Physical_Address = physical_Address2;
	}

	
	public String toString()
	{
		String output = "Name: " + Name;
		output +="Telephone: " + Telephone;
		output +="Email Address: " + Email_address;
		output +="Physical Address: " + Physical_Address;
		return output;
	}
	
}
