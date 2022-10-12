package customException;

public class BallNotAdded extends RuntimeException{  //Or
	public String getMessage() {
		return "Ball not Added";
	}
}
