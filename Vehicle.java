package car_dealership;

public class Vehicle {
	
	
	private String model;
	private int year;
	private double price;
	
	
	
	public Vehicle(String model, int year, double price) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		price += 600;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	
	
	

}
