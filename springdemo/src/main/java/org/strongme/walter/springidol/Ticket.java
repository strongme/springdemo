package org.strongme.walter.springidol;

public class Ticket {
	
	private static int seatNum = 0;
	
	public Ticket() {
		seatNum++;
	}
	
	public Ticket(int seatNum) {
		Ticket.seatNum = seatNum;
	}
	
	public void displaySeatNum() {
		System.out.println("My seat num is :"+seatNum);
	}
	
	

}
