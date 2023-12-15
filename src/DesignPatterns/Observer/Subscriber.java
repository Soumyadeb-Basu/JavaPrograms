package DesignPatterns.Observer;

public class Subscriber implements Observer{

    private String nameSubscriber;

    public Subscriber(String nameSubscriber) {
        this.nameSubscriber= nameSubscriber;
    }

    @Override
    public void notified(String title, String nameChannel) {
        System.out.println("Hi, "+nameSubscriber+", Youtube Channel "+nameChannel+" uploaded a new video titled "+title+" !");
    }
}
