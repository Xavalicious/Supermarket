
public class Customer {
	private String customerName;
	private double amount;
	public Customer(String c, double a){
	customerName=c;
	amount=a;
	
	}
	public double getAmount(){
	return amount;	
	}
	public String getCustomerName(){
	return customerName;	
	}
}
