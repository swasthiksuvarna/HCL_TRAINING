package customException;

import java.util.Scanner;

 /* created on 20-Apr-2022  */

public class BagDriver {
	public static void main(String[] args) {
		Bag b1 = new Bag();
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		while(exit) {
			System.out.println("******************GAME PORTAL**********************");
			System.out.println("1.Add Ball \n2.Remove Ball \n3.Check bag empty \n4.Show Game \n5.Exit");
			System.out.println("***************************************************");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("1.BasketBall \n2.TennisBall");
				int ball = sc.nextInt();
				if(ball == 1) 
					b1.addBook(new BasketBall(5));
				else 
					b1.addBook(new TennisBall(10));
				break;
			case 2: 
				b1.removeBall();
				break;
			case 3: 
				b1.isBallEmpty();
				break;
			case 4:
				b1.showGame();
				break;
			case 5: 
				exit = false;
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
		sc.close();
	}
}
