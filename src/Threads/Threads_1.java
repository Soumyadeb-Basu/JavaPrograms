package Threads;

class A extends Thread {

    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Thread A running..");
        }
    }

}

class B extends Thread {

    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Thread B running..");
        }
    }

}
public class Threads_1 {

    public static void main(String[] args) {

        A th1 = new A();
        B th2 = new B();

        th1.start();
        th2.start();
    }

}
