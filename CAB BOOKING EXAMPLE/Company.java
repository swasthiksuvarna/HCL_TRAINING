package linkedlist;
	import java.util.Scanner;
	import java.util.ArrayList;
	public class Company {
	Employee e;
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee> a = new ArrayList();
	public void addEmp() {
		System.out.println("Enter the employee name");
		String name=sc.next();
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		System.out.println("Enter the employee cno");
		long cno=sc.nextLong();
		System.out.println("Enter the employee city");
		String city=sc.next();
		e=new Employee(name,id,cno,city);
		a.add(e);
	}
	public void displayEmp() {
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		for(Employee e:a ) {
			if(id==e.id) {
				System.out.println(e);
				return;
			}
			
		}
		System.out.println("employee not found");
	}
	public void removeEmp() {
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		for(Employee e:a ) {
			if(id==e.id) {
		a.remove(e);
		System.out.println("Employee removed");
		return;
	}
	}
	}
	public void updateEmp() {
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		for(Employee e:a ) {
			if(id==e.id) {
				System.out.println("Enter the employee cno to update");
				long cno=sc.nextLong();	
				e.setcno(cno);
				System.out.println("Enter the employee city to update");
				String city=sc.next();	
				e.setcity(city);
				System.out.println("updated successfully");
				return;
			}
		}
		System.out.println("employee not found");	
	}
	}


