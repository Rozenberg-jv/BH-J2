package by.belhard.j2.lesson13.pre.threads;

public class Main {

	public static void main(String[] args) {

		Thread t1 = new Thread(new MyRunnable("run1"));
		Thread t2 = new Thread(new MyRunnable("run2"));

		Thread t3 = new MyThread("thr1");
		Thread t4 = new MyThread("thr2");
		Thread t5 = new MyThread("thr3");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		System.out.println("end of main()");
	}

}
