package linkedlist;

public class Employee {
	String name;
	int id;
	long cno;
	String city;
	public Employee(String name, int id,  long cno,String city) {
		this(name,id,cno);
		this.city=city;
	}
	public Employee(String name, int id, long cno) {
		this(name,id);
		this.cno = cno;
	}
	public Employee(String name,int id) {
		this(name);
		this.id = id;
	}
	public Employee(String name) {
		this.name =name;
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public long getcno() {
		return cno;
	}
	public String getcity() {
		return city;
	}
	public void setcno(long cno) {
		this.cno = cno;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public String toString() {
		return "Employee name =" +name+"\nEmployee city =" +city+ "\nEmployee id "+id+"\nEmployee cno="+cno;
	}
}
