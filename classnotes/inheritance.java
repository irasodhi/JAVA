// public class inheritance {
    
// }

class inheritance {
	  int roomNumber;
	    String wardenName;

	    void hostelInfo() {
	        System.out.println("Room No: " + roomNumber);
	        System.out.println("Warden: " + wardenName);
	    }
	      
}
class ChitkaraWoods extends inheritance{

   String specialFacility = "AC Rooms + Gym";

   void woodsInfo() {
       System.out.println("Special Facility: " + specialFacility);
   }
}	
class Main {
   public static void main(String[] args) {

       ChitkaraWoods woods = new ChitkaraWoods();

       woods.roomNumber = 101;
       woods.wardenName = "Mr. Sharma";

       
       woods.woodsInfo(); 
       woods.hostelInfo();
   }
}