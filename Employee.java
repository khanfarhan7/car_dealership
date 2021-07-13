package car_dealership;

public class Employee {
	
	Customer cust2= new Customer ("Tim", "37652 Baylor Dr", 3000);
	Vehicle vehicle1 = new Vehicle ("Tesla", 2017, 4000);
	

	private String name;
	
	public Employee(String name) {
		super();
		this.setName(name);
	}

	
	
	
	public void handleCustomer (Customer cust2, boolean finance, Vehicle vehicle1) {
		
		if (finance==true) {
			
			double loanAmount = vehicle1.getPrice()-cust2.getCashOnHand();
			runCreditHistory(cust2, loanAmount);
		}
		else if (vehicle1.getPrice()<=cust2.getCashOnHand()) {
			
			processTransaction (cust2,vehicle1);
		}
		else {
			
			System.out.println("Not enough cash available");
		}
	
		
		//System.out.println("Method working");
	}
	
	public void runCreditHistory (Customer cust2, double loanAmount) {
		
		System.out.println("Ran Credit History");
		System.out.println("Loan Amount : " + loanAmount);
		
	}
	
	public void processTransaction (Customer cust2, Vehicle vehicle1) {
		System.out.println("Vehicle SOLD: " + vehicle1 );
		
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
