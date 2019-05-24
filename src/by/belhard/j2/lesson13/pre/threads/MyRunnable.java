package by.belhard.j2.lesson13.pre.threads;

public class MyRunnable implements Runnable {

    private final String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 1000000; i++) {
//				Thread.sleep(1);
                /*System.out.println(i + " iteration of Runnable " + name);*/
                inc();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.printf("Thread %s ends\n", this.name);
    }

    public static synchronized void inc() {
        Main.q++;
    }
}
