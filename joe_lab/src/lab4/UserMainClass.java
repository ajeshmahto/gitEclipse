package lab4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class UserMainClass {
	
	public static void main(String[] args) {
		
		double TotalpayCheckAmount=0;
		
		List<Order> order1 = new ArrayList<Order>();
		List<Order> order2 = new ArrayList<Order>();
		Date todayDate = new Date();
		
		order1.add(new Order(5,1,todayDate,2000));
		order1.add(new Order(5,2,todayDate,3000));
		order2.add(new Order(6,3,todayDate,5000));
		order2.add(new Order(6,4,todayDate,1000));
		
		Employee hourlyEmployee1= new Hourly(1,10,20);
		Employee hourlyEmployee2= new Hourly(2,10,25);
		Employee salariedEmployee1= new Salaried(3,1000);
		Employee salariedEmployee2= new Salaried(4,2000);
		Employee commissionedEmployee1 = new Commissioned(5,0.25,1000,order1);
		Employee commissionedEmployee2 = new Commissioned(5,0.25,1000,order1);
		Employee commissionedEmployee3 = new Commissioned(6,0.25,2000,order1);
		Employee commissionedEmployee4 = new Commissioned(6,0.25,2000,order1);
		
	    Employee[] employee = {hourlyEmployee1,	hourlyEmployee2,salariedEmployee1,salariedEmployee2,
	    		commissionedEmployee1,commissionedEmployee2,commissionedEmployee3,commissionedEmployee4};
	    
	    
	    for(Employee e:employee)
	    {
	    	TotalpayCheckAmount+=e.calcGrossPay();
	    	
	    }
	    
	    System.out.println("Total paycheck: "+TotalpayCheckAmount);
	}
		
}


