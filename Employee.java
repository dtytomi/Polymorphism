public abstract class Employee implements Payable {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	// three-argument constructor
	public Employee( String first, String last, String ssn ) {

		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;

	} // end three-argumrnt Employee constructor

	// set first name
	public void setFirstName( String first ) {

		firstName = first; // should validate
	} // end method setFirstName

	// return first name 
	public String getFirstName() {

		return firstName;
	} // end method getFirstName

	// set last name
	public void setLastName( String last ) {

		lastName = last; // should validate
	} // end method setlastName

	// return last name 
	public String getLastName() {

		return lastName;
	} // end method getLastName

	// set first name
	public void setSocialSecurityNumber( String ssn ) {

		socialSecurityNumber = ssn; // should validate
	} // end method setFirstName

	// return first name 
	public String getSocialSecurityNumber() {

		return socialSecurityNumber;
	} // end method getFirstName

	// return String representation of Employee object
	@Override
	public String toString() {

		return String.format("%s %s\nsocial security number: %s",
			getFirstName(), getLastName(), getSocialSecurityNumber() );
	}

	// Note: we do not implement Payable method getPaymentAmount here so
	// this class must be declared abstract to avoid a compilation error

} // end abstract class Employee
