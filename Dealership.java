package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust2 = new Customer("Sarah", "615 S Hardy Dr", 4500);
		Vehicle v1= new Vehicle("Honda",2022,23000);
		Vehicle v2 = new Vehicle ("Tesla",2021,45000);
		v1.setPrice(2000);
		Employee e1 = new Employee("John",6500);
		cust2.setName("Tom");
		cust2.setAddress("12690 Gallagher St");
		cust2.setCashOnHand(15000);
		cust2.purchaseCar(v2, e1, true);
		e1.handleCustomer(cust2, false, v2);
		

	}

}
