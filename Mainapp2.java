package com;

import java.util.Scanner;

public class Mainapp2 {

 public static void main(String[] args) {
  Passenger p=new Passenger();
  Scanner sc=new Scanner(System.in);
  boolean isstart=true;
  while(isstart) {
   System.out.println("enter the choice:/n 1.addticket /n "
     + "2.displayticket /n /n "
     + "3.searchticketbasedonboardingpoint "
     + "4.changedestination( /n 5.removebookbasedonid");
   int ch=sc.nextInt();
   switch(ch) {
   case 1:{
    System.out.println("enter the ticketid");
    int id=sc.nextInt();
    System.out.println("enter the ticketcost");
    int cost=sc.nextInt();
    System.out.println("enter the boardingpoint");
    String boardingpoint=sc.next();
    System.out.println("enter the designationpoint");
    String designation=sc.next();
        p.addBookTicket(new Ticket(id,cost,boardingpoint,designation));
   }
    break;
   case 2:{
    p.Display();
   }
    break;
   case 3:{
    System.out.println("enter id to searchboardingpoint");
    String boradingpoint=sc.next();
    p.searchtickBoardingPoint(boradingpoint);
    break;
   }
   case 4:{
    System.out.println("enter the desination to searchboarding");
    String destination=sc.next();
    p.changeDestination(destination);
    break;
   }
   case 5:{
    System.out.println("enter the title to updated cost");
    int id=sc.nextInt();
    p.removeticket(id);
    break;
   }
   case 6:{
    isstart=false;
    System.out.println("thank you");
   }
    break;
    default:System.out.println("enter invalid choice");
   }
  }

 }

}