/**
 * 
 */

/**
 * @author LPOTT
 *
 */
import java.util.*;
public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		project_object pr;
		// TODO Auto-generated method stub
		pr = new project_object("hh", "12/09/2020",5400,"0123455","NO");
		
		pr.addContractor("nathan","+227546214","hypercrs@google.com", "5 jonson str");
		pr.addArchitechture("carl", "+227584617", "crowsfeet@google.co.za","21 foget av");
		pr.addCustomer("kevin","+22754135","constute@google.com","1 number str");
	}
}
