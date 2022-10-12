package customException;

/* created on 20-Apr-2022  */

public class Bag {
	Ball b;
	
	public void addBook(Ball b) {
		if(this.b == null) {
			this.b = b;
			System.out.println("Ball added Successfully");
		}
		else {
			throw new BallNotAdded();
		}
	}
	
	public void removeBall() {
		if(this.b == null) {
			throw new BallNotAdded();
		}
		else {
			if(b instanceof BasketBall) {  			//CHECKING IF THE BALL TO BE REMOVED IS BASKETBALL OR TENNIS BALL
				b = null;
				System.out.println("BasketBall removed");
			}
			else {
				b = null;
				System.out.println("TennisBall is removed");
			}
		}
	}
	
	public void isBallEmpty() {
		if(this.b == null) 
			System.out.println("Bag is empty");
		else {
			if(b instanceof BasketBall) {
				System.out.println("BasketBall in the bag");
			}
			else {
				System.out.println("TennisBall in the bag");
			}
		}
	}
	
	public void showGame() {
		if(this.b == null) {
			throw new BallNotAdded();
		}
		else {
			if(b instanceof BasketBall) {
				System.out.println("BasketBall");
			}
			else {
				System.out.println("Tennis ball");
			}
		}
	}
}

