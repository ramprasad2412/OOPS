package com.jspider.encapsulation;
class Customer{
	private int cid;
	private String cname;
	private long contact;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	
	
}

public class Mainclass2 {

	public static void main(String[] args) {
		Customer c= new Customer();
		c.setCid(101);
		c.setCname("Ram Prasad");
		c.setContact(9430814413l);
		System.out.println("Customerid:"+ c.getCid());
		 System.out.println("Customer name :"+ c.getCname());
		 System.out.println("Customer contact:"+c.getContact());
		
		// TODO Auto-generated method stub

	}

}
