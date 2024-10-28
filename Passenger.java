package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Passenger {
	
	private String name;
	private int age;
	private int mobile;
	private String gender;
	
	private Ticket t;
	
	private ArrayList <Ticket> ticket = new ArrayList<Ticket>();
	
	//book ticket
	
	public void addBookTicket(Ticket t) {
		ticket.add(t);
		System.out.println("ticket Added Sucessfully..");
	}
	
	public void Display() {
		if(ticket.isEmpty()) {
		System.out.println("ticket is wait list");	
		}
		else {
			for(Ticket t :ticket) {
				t.display();
			}
		}
	}
	
	//searchtickboardingpoint based on boarding point
	
	public void searchtickBoardingPoint(String Boarding) {
		boolean isFound=false;
		if(ticket.isEmpty()) {
			System.out.println("boarding point not yet selected");
		}
		
		else {
			for(Ticket t :ticket) {
				if(t.getBoardingPoint()==Boarding) {
					System.out.println("boarding point"+Boarding);
					isFound = true;
				}
			}
		}
		if(isFound==false) {
			System.out.println("your are enterd invaild boarding point");
		}
	}
// change desination based on id 
	
	public void changeDestination(String Destinationpoint) {
		boolean isChange=false;
		if(ticket.isEmpty()) {
			System.out.println("desination not change");
		}
		else {
			for(Ticket t:ticket) {
				if(t.getDesinationPoint().equals(Destinationpoint)) {
					t.setDesinationPoint("kerala");
					System.out.println("desination is change");
					isChange = true;
				}
			}
			
			if(isChange==false) {
				System.out.println("Enterd invaild desination,,desination is not found");
			}
		}
	}
	
	//remove the ticket based on id
	
	public void removeticket(int id) {
		boolean isFound = false;
		if(ticket.isEmpty()) {
			System.out.println("Books are not yet added");
		}
		
		else {
			Iterator<Ticket> itr = ticket.iterator();
			while(itr.hasNext()) {
				if(t.getid()==id) {
					itr.remove();
					System.out.println("ticket is removed successfully");
					isFound=true;
				}
			}
			if(isFound=false) {
				System.out.println("you have entered invalid book id,,book not found");
			}
		}
	}
}
