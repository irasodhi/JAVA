
// create a class named counter
// create function increment
// create 2 threads that will run 1000 times each
// so output should be 2000
class multithreading extends Thread {
	static int counter;

	synchronized public void increment() {

		for (int i = 1; i <= 1000; i++) {
			++counter;
		}
	}

	public void run() {
		increment();
	}

	public static void main(String[] args) throws Exception {
		multithreading t1 = new multithreading();
		multithreading t2 = new multithreading();
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println("Counter: " + counter);
	}

}

