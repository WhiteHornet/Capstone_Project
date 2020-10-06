/**
 * 
 */

/**
 * @author LPOTT
 *
 */
public class project_object {
	String New_Project_name;
	String due_date;
	double amount_paid;
	String Contact_details;
	String Project_finilizing;
	
	Person contractor;
	Person customer;
	Person architecture;
	//constructor
	project_object(String pname, String duedate, double ampaid, String contactdetails, String pfinalised){
		New_Project_name = pname;
		
	}
	
/*	public void constructor(String Name,String Telephone,String Email_address,String Physical_Address)
	{
		Person constructor = new Person(Name,Telephone,Email_address, Physical_Address);
		Person customer = new Person(Name,Telephone,Email_address, Physical_Address);
		Person architecture = new Person(Name,Telephone,Email_address, Physical_Address);
	}
	*/
	public void addContractor(String Name,String Telephone,String Email_address,String Physical_Address) {
		contractor = new Person(Name,Telephone, Email_address,Physical_Address);
	}
	
	public void addCustomer(String Name,String Telephone,String Email_address,String Physical_Address)
	{
		customer = new Person(Name,Telephone, Email_address,Physical_Address);
	}
	
	public void addArchitecture(String Name,String Telephone,String Email_address,String Physical_Address)
	{
		architecture = new Person(Name,Telephone, Email_address,Physical_Address);
	}
	public Person getContractor()
	{
		return contractor;
	}
	
	public Person getCustomer()
	{
		return customer;
	}
	
	public Person getArchitecture()
	{
		return architecture;
	}

}
