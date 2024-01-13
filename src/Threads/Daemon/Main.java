package Threads.Daemon;

public class Main {

    public static void main(String[] args) {

        NormalThread thread= new NormalThread();
        System.out.println(thread.isDaemon());

        thread.setDaemon(true);
        System.out.println(thread.isDaemon());

        thread.setDaemon(false);

        thread.start();




    }
}
