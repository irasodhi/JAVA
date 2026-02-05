
abstract class abstr{//Car
	int button;
abstr(String s){
	this.button=Integer.parseInt(s);
	System.out.println("abstract class car");
}
abstract void start();
void stop() {
	System.out.println(" car engine stopped");
}
}
class alto extends abstr{
	alto(){
		super("100");
		System.out.println("child class alto");
	}
	void start() {
		System.out.println("insert the key gareeb");
	}
	   public static void main(String[] args) {
	        alto a = new alto();
	        a.start();
	        a.stop();
	    }
}
