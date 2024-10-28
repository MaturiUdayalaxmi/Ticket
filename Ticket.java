package com;

import java.util.Random;

public class Ticket {
	
	private int id;
	private int cost;
	private String BoardingPoint;
	private String DesinationPoint;
	
	
	
	Random r = new Random();
	
	public Ticket(int id,int cost,String BoardingPoint,String DesinationPoint ) {
		this.id=r.nextInt(123456);
		this.cost=cost;
		this.BoardingPoint=BoardingPoint;
		this.DesinationPoint=DesinationPoint;
	}
	
	

	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setcost(int cost) {
		this.cost=cost;
	}
	
	public int getcost() {
		return cost;
	}
	public void setBoardingPoint(String BoardingPoint) {
		this.BoardingPoint=BoardingPoint;
	}
	public String getBoardingPoint() {
		return BoardingPoint;
	}
	public void setDesinationPoint(String DesinationPoint) {
		this.DesinationPoint=DesinationPoint;
	}
	public String getDesinationPoint() {
		return DesinationPoint;
		
	}
	
	public void display() {
		System.out.println("Ticket id"+getid());
		System.out.println("Ticket cost"+getcost());
		System.out.println("BoardingPoint"+getBoardingPoint());
		System.out.println("DesinationPoint"+getDesinationPoint());
	}
	
	 @Override
	  public String toString() {
	   
	    return " \n tittle "+id+ "\nid"+id+ "\n cost" +cost+ "\n BoardingPoint------->" +BoardingPoint + "\n Desination" +DesinationPoint +"\n -------------------------->";
	   }


}
