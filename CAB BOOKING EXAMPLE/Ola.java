package cab;


public class Ola {
	Cab b;
	public void bookcab(Cab b) {
		if(this.b==null) {
			this.b=b;
			System.out.println("cab booked");
		}
		else {
			System.out.println("cab is already booked....");
		}
	}
	public void cancelcab() {
		if(this.b==null) {
			System.out.println("cab is not booked");
		}
		else {
			if(b instanceof Prime) {
				b=null;
				System.out.println("Prime Removed");
			}
			else if(b instanceof Mini){
				b=null;
				System.out.println("Mini Removed");
			}
			else if(b instanceof Macro)
				b=null;
				System.out.println("Macro Removed");
		}
	}
	public void checkBooked() {
		if(this.b==null) {
			System.out.println("cab is not booked");
		}
		else {
			if(b instanceof Prime) {
			
				System.out.println("Prime booked");
			}
			else if(b instanceof Mini) {
				System.out.println("Mini booked");
			}
			else {
				System.out.println("Macro booked");
			}
		}
	}
	public void showCab() {
		if(this.b==null) {
			System.out.println("cab is not booked");
		}
		else {
			if(b instanceof Prime) {
				
				System.out.println("Prime ");
			}
			else if(b instanceof Mini){
			
				System.out.println("Mini ");
			}
			else
				System.out.println("Macro ");
		}
	}
	
}
