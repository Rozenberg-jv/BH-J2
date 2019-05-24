package by.belhard.j2.lesson13.pre.threads;

public class Main {

    public static int q = 0;

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyRunnable("run1"));
        Thread t2 = new Thread(new MyRunnable("run2"));
        Thread t3 = new Thread(new MyRunnable("run2"));
        Thread t4 = new Thread(new MyRunnable("run2"));
        Thread t5 = new Thread(new MyRunnable("run2"));
        Thread t6 = new Thread(new MyRunnable("run2"));
        Thread t7 = new Thread(new MyRunnable("run2"));
//		t1.setDaemon(true);
//		t2.setDaemon(true);
        /*Thread t3 = new MyThread("thr1");
        Thread t4 = new MyThread("thr2");
        Thread t5 = new MyThread("thr3");*/

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        /*t3.start();
        t4.start();
        t5.start();*/

        try {
            t1.join();
            t2.join();
            /*t3.join();
            t4.join();
            t5.join();*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(q);
        System.out.println("end of main()");
    }

}
