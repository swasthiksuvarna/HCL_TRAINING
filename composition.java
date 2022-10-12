public class Creator {
public static void main(String args[]) {
Human h1 = new Human();
h1.displayHuman();
System.out.println("----------------------------------------");
h1.h1.displayHeart();
System.out.println("----------------------------------------");
h1.h1.heartColor = "red";
h1.h1.price = 20000;
h1.h1.brand = "abcd";
System.out.println("----------------------------------------");
h1.displayHuman();
System.out.println("----------------------------------------");
h1.h1.displayHeart();
}
}




public class Human {
String name = "Amisha";
int age = 21;
String bloodgrp = "O+ve" ;
Heart h1 = new Heart();
public void displayHuman() {
System.out.println(name);
System.out.println(age);
System.out.println(bloodgrp);
}
}



public class Heart {
String heartColor = "yellow";
double price = 100000;
String brand = "tata";
public void displayHeart() {
System.out.println(heartColor);
System.out.println(price);
System.out.println(brand);

}
}
