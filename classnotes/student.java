package oops;
//package com.chitkara.oops;
//
////public class Has_A_Relation {
////
////}
//
////1. COMPOSITION -> an engine cannot exist without a car
//
//class Engine {
//	String type;
//
//	public Engine(String type) {
//		this.type = type;
//	}
//
//	void Rev() {
//		System.out.println("Engine is revolving...");
//	}
//}
//
////2. Aggregation -> a music system can exist independently (its an accessory)
//class MusicSystem {
//	String brand;
//
//	void play() {
//		System.out.println("song is being played...");
//	}
//}
//
//class Tata {
//	String modal;
//	private Engine eg;
//	private MusicSystem musicSystem;
//
//	// composition
//	public Tata(String mo, String engin) {
//		this.modal = mo;
//		this.eg = new Engine(engin); // we are defining the engine in starting only
//	}
//
//	// setter for aggregation (adding the accessory later)
//	void installMusicSystem(MusicSystem ms) {
//		this.musicSystem = ms;
//		System.out.println();
//	}
//}
//
//class Altroz2 extends Tata {
//	Altroz2() {
//		super("Altroz", "1.2L Diesal"); // to set engine from standard generics
//	}
//}
//
//class Punch2 extends Tata {
//	public Punch2() {
//		super("Punch", "1.2L Petrol");
//	}
//}
//
//class Main10 {
//	public static void main(String[] args) {
//		MusicSystem ms = new MusicSystem();
//		Altroz2 altroz = new Altroz2();
//		altroz.installMusicSystem(ms);
//		Punch2 punch = new Punch2();
//	}
//}

//package com.chitkara.oops;
//
////1. COMPOSITION -> an engine cannot exist without a car
//class Engine {
//	String type;
//
//	public Engine(String type) {
//		this.type = type;
//	}
//
//	void Rev() {
//		System.out.println("Engine is revolving...");
//	}
//}
//
////2. Aggregation -> a music system can exist independently (it's an accessory)
//class MusicSystem {
//	String brand;
//
//	void play() {
//		System.out.println("song is being played...");
//	}
//}
//
//class Tata {
//	String modal;
//	private Engine eg;
//	private MusicSystem musicSystem;
//
//	// Composition
//	public Tata(String mo, String engin) {
//		this.modal = mo;
//		this.eg = new Engine(engin); // we are defining the engine at the start only
//	}
//
//	// Setter for Aggregation (adding the accessory later)
//	void installMusicSystem(MusicSystem ms) {
//		this.musicSystem = ms;
//		System.out.println("Music System installed successfully.");
//	}
//}
//
//class Altroz12 extends Tata {
//	Altroz12() {
//		super("Altroz", "1.2L Diesel"); // Fixed spelling from "Diesal" to "Diesel"
//	}
//}
//
//class Punch2 extends Tata {
//	public Punch2() {
//		super("Punch", "1.2L Petrol");
//	}
//}
//
//class Main10 {
//	public static void main(String[] args) {
//		MusicSystem ms = new MusicSystem();
//
//		Altroz12 altroz = new Altroz12();
//		altroz.installMusicSystem(ms); // Aggregation in action
//
//		Punch2 punch = new Punch2();
//	}
//}

//public class CLA {
//	public static void main(String[] args) {
////		System.out.println(args[0]);
////		System.out.println(args[1]);
////		System.out.println(args[0] + args[1]);
////		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
//
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		System.out.println(args[0] + args[1] + args[2]);
//	}
//}


//public class student {
//    int id;
//    String name;
//
// 
//    private student() {
//        System.out.println("ira");
//    }
//
//   
//    static student getObj() {
//        return new student();
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        student s = student.getObj();  
//    }
//}



