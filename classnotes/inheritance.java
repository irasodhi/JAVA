// public class inheritance {
    
// }

// class inheritance {
// 	  int roomNumber;
// 	    String wardenName;

// 	    void hostelInfo() {
// 	        System.out.println("Room No: " + roomNumber);
// 	        System.out.println("Warden: " + wardenName);
// 	    }
	      
// }
// class ChitkaraWoods extends inheritance{

//    String specialFacility = "AC Rooms + Gym";

//    void woodsInfo() {
//        System.out.println("Special Facility: " + specialFacility);
//    }
// }	
// class Main {
//    public static void main(String[] args) {

//        ChitkaraWoods woods = new ChitkaraWoods();

//        woods.roomNumber = 101;
//        woods.wardenName = "Mr. Sharma";

       
//        woods.woodsInfo(); 
//        woods.hostelInfo();
//    }
// }
class hostel{
	int nostudent=50;
	public hostel(int nos) {
		this.nostudent=nos;
		System.out.println(nostudent);
	}
	void rule() {
		System.out.println(" in by 9pm");
	}
}


class woods1 extends hostel{
	public woods1() {
		super(200);
		System.out.println("calling wood constructor");
	}
	
	void rule() {
		super.rule();
		super.nostudent=100;
		System.out.println(nostudent);
		System.out.println("but enjoy forest view");
	}
	public static void main(String[] args) {
        woods1 w = new woods1();
        w.rule();    }
}