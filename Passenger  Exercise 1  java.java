import java.util.Scanner;

public class Passenger {
	Scanner sc = new Scanner(System.in);
	int pnrnumber;
	String passengername;
	String journeydate;
	String source; 
	String destination;
	public void Book() {
		System.out.println("Book Ticket");
	}
	public void Cancel() {
		System.out.println("Cancel Ticket");
	}
	public void modify() {
		System.out.println("Modify Ticket");
	}
	public void Display() {
		System.out.println("-----Display Ticket Details-----");
		System.out.println("Pnr Number:"+pnrnumber);
		System.out.println("Enter Passenger Name:"+passengername);
		System.out.println("Enter journey Date:"+journeydate);
		System.out.println("Enter Source:"+source);
		System.out.println("Enter Destination:"+destination);
	}
	public void acceptdetails() {
		System.out.print("Enter Pnr Name:");
		pnrnumber = sc.nextInt();
		System.out.print("Enter  Passenger Name:");
		passengername = sc.next();
		System.out.print("Enter journey Date:");
		journeydate = sc.next();
		System.out.print("Enter Source:");
		source = sc.next();
		System.out.print("Enter Destination:");
		destination = sc.next();
	}

	public static void main(String[] args) {
		Passenger p =new Passenger();
		p.Book();
		p.acceptdetails();
		p.Display();
		p.modify();
		p.Cancel();
		
	}

}
