package cab;
import java.util.Scanner;
public class CabDriver {

	public static void main(String[] args) {
				Ola o = new Ola();
				Scanner sc = new Scanner(System.in);
				while(true) {
					System.out.println("1.Book cab\n  2.Cancel Cab\n 3.Is cab Booked or not\n  4.Show cab\n  5.Exit\n");
					System.out.println("enter the choice");
					int c = sc.nextInt();
					switch(c) {
					case 1: 
						System.out.println("1.Prime\n 2.Mini\n 3.Macro");
						int ch = sc.nextInt();
						if(ch==1) {
							o.bookcab(new Prime(10));
							System.out.println("prime booked");
						}
						else if(ch==2) {
							o.bookcab(new Mini(10));
							System.out.println("Mini booked");
						}
						else {
							o.bookcab(new Macro(10));
							System.out.println("Macro booked");
						}
						break;
					case 2:
						o.cancelcab();
						break;
					case 3:
						o.checkBooked();
						break;	
					case 4: 
						o.showCab();
						break;
					case 5:
						System.exit(0);
					default:
						System.out.println("invalid");
					}
				}
			
			}
}

