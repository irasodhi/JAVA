
public class encap {
private int fuelCapacity=20;
public encap(int fl) {
	this.fuelCapacity=fl;
}
int getFuel() {
	return fuelCapacity;
}
void setFuel(int lit) {
	fuelCapacity+=lit;
}
}
class Main{
public static void main(String[] args) {
   encap encap1=new encap(40);
   encap encap2=new encap(40);
   System.out.println(encap1==encap2);
   
   
}
}
