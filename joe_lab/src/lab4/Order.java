package lab4;

import java.util.Date;

public class Order {
	
	private int orderNo;
	private Date orderDate;
	private double orderAmount;	
	private int  employeeId;
	
	public Order( int employeeId,int orderNo, Date orderDate, double orderAmount) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.employeeId = employeeId;
	}
	
	
	
	

}
