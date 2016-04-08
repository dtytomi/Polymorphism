public class PayableInterfaceTest {

	public static void main( String[] args ) {

		// create four-element Payable array
		Payable[] payableObjects = new Payable[ 7 ];

		// populate array with objects that implement Payable
		payableObjects[ 0 ] = new Invoice( "01234", "seat", 2, 375.00 );
		payableObjects[ 1 ] = new Invoice( "56789", "tire", 4, 79.95 );
		payableObjects[ 2 ] = 
			new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );
		payableObjects[ 3 ] = 
			new SalariedEmployee( "John", "Smith", "888-88-8888", 1200.00 );
		payableObjects[ 4 ] = 
			new HourlyEmployee( "Adeniran", "Esther", "333-33-3333", 15.45, 15 );
		payableObjects[ 5 ] = 
			new CommissionEmployee( "Aworetan", "Soji", "444-44-4444", 10000.00, .05 );
		payableObjects[ 6 ] = 
			new BasePlusCommissionEmployee( "Abbey", "Adams", "777-77-7777", 1500.00,  .08, 200 );	

		System.out.println(
			"Invoices and Employees processed polymorphically:\n");

		// generically process each element in array payableObject
		for ( Payable currentPayable : payableObjects ) {
			
				// output currentPayable and its appropriiate payment amount
				System.out.printf( "%s \n%s: $%,.2f\n\n",
					currentPayable.toString(), 
					"payment due", currentPayable.getPaymentAmount() );
		} // end for 

	} // end main
} // end class PayableInterfaceTest