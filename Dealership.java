package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust2 = new Customer("Sarah", "615 S Hardy Dr", 5000);
		Vehicle v1= new Vehicle("Honda",2022,23000);
		Vehicle v2 = new Vehicle ("Tesla",2021,45000);
		Employee e1 = new Employee("John");
		
		
		cust2.purchaseCar(v1, e1, true);
		
		System.out.println("Name of the customer who visited dealership: " + cust2);

	}

}
