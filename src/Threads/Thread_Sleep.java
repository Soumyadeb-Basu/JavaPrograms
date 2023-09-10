package Threads;

class Test1 extends Thread {

    public void run() {
        for(int i=0;i<20;i++) {
            System.out.println("Thread A running..");

            try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
    }

}

class Test2 extends Thread {

    public void run() {
        for(int i=0;i<20;i++) {
            System.out.println("Thread B running..");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
public class Thread_Sleep {

    public static void main(String[] args) {

        Test1 t1 = new Test1();
        Test2 t2 = new Test2();

        t1.start();
        t2.start();;

    }
}
