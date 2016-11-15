import java.util.ArrayList;
import java.util.Scanner;


public class Store {
	public ArrayList<Customer> list=new ArrayList<Customer>();
	public void addSale(){
		boolean fact=true;
		int a=0;
		while(fact==true)
		{
		Scanner objTake=new Scanner(System.in);
		System.out.println("Please enter customer name(\"Exit\" to abort)");
		String name=objTake.next();
		if(name.toUpperCase().equals("EXIT"))
		{
		break;
		}
		System.out.println("Please enter sale amount of customer");
		double amount1=objTake.nextDouble();
		Customer setter=new Customer(name,amount1);	
		list.add(a,setter);
		a++;
		}
	}
	public String nameOfBestCustomer(){
		double highest=0;
		double highest1=0;
		int c=0;
		int d=0;
		for(int b=0;b<list.size();b++)
		{
		highest=list.get(b).getAmount();
		if(highest>highest1)
		{
		highest1=highest;
		c=b;
		}
		}	
		String highName=list.get(c).getCustomerName();
		return highName;	
	}
}
