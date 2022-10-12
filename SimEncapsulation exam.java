public class Sim {
private String serviceprovider;
private int simno;
private String color;
Sim(String serviceprovider, int simno) {
this.serviceprovider = serviceprovider;
this.simno = simno;
}
Sim(String serviceprovider, int simno, String color) {
this(serviceprovider,simno);
this.color = color;
}
public String getServiceprovider() {
return serviceprovider;
}
public int getSimno() {
return simno;
}
public String getColor() {
return color;
}
public void setColor(String color) {
this.color = color;
}
public void display() {
System.out.println(serviceprovider);
System.out.println(simno);
System.out.println(color);
}

}
