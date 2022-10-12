package linkedlist;
import java.util.Scanner;
public class CDriver {
	public static void main(String[] args) {
				Company c = new Company();
				Scanner sc = new Scanner(System.in);
				while(true) {
					System.out.println("1.Add Employee\n  2.Remove Employee\n 3.Update Employee\n  4.Display Employee\n  5.Exit\n");
					System.out.println("enter the choice");
					int choice = sc.nextInt();
					switch(choice) {
					case 1:
						c.addEmp();
						break;
					case 2:
						c.removeEmp();
						break;
					case 3:
						c.updateEmp();
						break;
					case 4: 
						c.displayEmp();
						break;
					case 5: 
						System.exit(0);
					default :
						System.out.println("invalid choice");
					}

			}

		}
		

}