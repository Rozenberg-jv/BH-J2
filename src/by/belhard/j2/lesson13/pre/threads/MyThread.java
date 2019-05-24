package by.belhard.j2.lesson13.pre.threads;

public class MyThread extends Thread {

	private final String name;

	public MyThread(String name) {

		this.name = name;
	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				sleep(1000);

				System.out.println(i + " iteration of Thread " + name);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.printf("Thread %s ends\n", this.name);
	}
}
