import java.util.Scanner;
class Ticket
{
  private int ticketno;
private String name;
private long cno;
private String arrival;
private String departure;
//Ticket(){}
Ticket(int ticketno,String name,long cno,String arrival,String departure)
{
	this.ticketno=ticketno;
	this.name=name;
	this.cno=cno;
	this.arrival=arrival;
	this.departure=departure;
}
public int getticketno()
{
	return ticketno;
}
public String getarrival()
{
return arrival;
}
public String getdeparture()
{
return departure;
}
public long getcno()
{
return cno;
}
public void setcno(long cno)
{
this.cno=cno;
}
public void setarrival(String arrival)
{
this.arrival=arrival;
}
public void setdeparture(String departure)
{
this.departure=departure;
}
public String getname()
{
return name;
}
public void setname(String name)
{
this.name=name;
}
}
class Flight{
String airlines;
String fno;
Ticket t;
//Flight(){}
Flight(String airlines,String fno)
{
this.airlines=airlines;
this.fno=fno;
}
public void booktickets()
{
if(this.t==null)
{
   Scanner s=new Scanner(System.in);
System.out.println("Enter the ticket number:");
int ticketno=s.nextInt();
System.out.println("Enter the name:");
String name=s.next();
System.out.println("Enter the arrival place:");
String arrival=s.next();
System.out.println("Enter the departure place:");
String departure=s.next();
System.out.println("Enter the contact no:");
long cno=s.nextLong();
this.t=new Ticket(ticketno,name,cno,arrival,departure);
System.out.println("TICKET BOOKED SUCCESSFULLY");
}
else
{
System.out.println("ticket is already booked");
}
}
public void showTicketdetails()
{
if(this.t!=null)
{
System.out.println("ticket number"+this.t.getticketno());
System.out.println("name"+this.t.getname());
System.out.println("arrival place"+this.t.getarrival());
System.out.println("departure place"+this.t.getdeparture());
System.out.println("contact number"+this.t.getcno());
}
else
{
	System.out.println("You havent booked any ticket");
}
}
public void updatearrival()
{
Scanner s=new Scanner(System.in);
if(this.t!=null)
{
System.out.println("Enter new arrival place");
String arrival=s.next();
this.t.setarrival(arrival);
}
else
{
System.out.println("YOU HAVEN'T BOOKED ANY TICKET");
}
}
public void updatedeparture()
{
Scanner s=new Scanner(System.in);
if(this.t!=null)
{
System.out.println("Enter new departure place");
String departure=s.next();
this.t.setdeparture(departure);
}
else
{
System.out.println("YOU HAVEN'T BOOKED ANY TICKET");
}
}
public void showFlightdetails()
{
System.out.println("airlines:"+airlines);
System.out.println("flight number:"+fno);
}
public void canceldetails()
{
this.t=null;
System.out.println("Ticket cancelled");
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the airline name");
String airlines=s.next();
System.out.println("enter the flight number");
String fno=s.next();
Flight r=new Flight(airlines,fno);

while(true)
{
System.out.println("1.book\n2.ticketdetails\n3.updatearrival\n4.updatedeparture\n5.flightdetails\n6.cancelTicket\n7.exit\n");
System.out.println("Enter your choice");
int choice=s.nextInt();
switch(choice)
{
case 1:
r.booktickets();
break;

case 2:
r.showTicketdetails();
break;
case 3:
r.updatearrival();
break;
case 4:
r.updatedeparture();
break;
case 5:
r.showFlightdetails();
break;
case 6:
r.canceldetails();
break;
case 7:
System.exit(0);
default:
System.out.println("invalid input");
}
}
}
}





	 



