package Threads;

public class Thread_runnable {

    public static void main(String[] args) {

        Runnable obj1 = ()->
        {
            for(int i=0;i<20;i++) {
                System.out.println("Thread A running..");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        Runnable obj2 = () ->
        {
            for(int i=0;i<20;i++) {
                System.out.println("Thread B running..");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        t2.start();

    }

}
