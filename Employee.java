package car_dealership;

public class Employee {
	
	Customer cust2= new Customer ("Tim", "37652 Baylor Dr", 3000);
	Vehicle vehicle1 = new Vehicle ("Tesla", 2017, 4000);
	

	double loanAmount = vehicle1.getPrice()-cust2.getCashOnHand();
	
	//double loanAmount=3500;
	private String name;
	
	public Employee(String name, double loanAmount) {
		super();
		this.loanAmount = loanAmount;
		this.setName(name);
	}

	
	public void runCreditHistory (Customer cust2, double loanAmount) {
		
		System.out.println("Ran Credit History");
		
	}
	
	public void processTransaction (Customer cust2, Vehicle vehicle1) {
		System.out.println("Processing Transaction....");
		
	}

	
	public void handleCustomer (Customer cust2, boolean finance, Vehicle vehicle1) {
		
		if (finance==true) {
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
