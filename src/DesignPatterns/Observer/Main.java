package DesignPatterns.Observer;

public class Main {

    public static void main(String[] args) {

        YoutubeChannel cricketChannel= new YoutubeChannel("CricketLegends");
        YoutubeChannel cookChannel= new YoutubeChannel("Cooking Urban");

        Subscriber sub1= new Subscriber("Sam");
        Subscriber sub2= new Subscriber("Richard");

        cricketChannel.subscribe(sub1);
        cookChannel.subscribe(sub2);

        cricketChannel.notifyChanges("Swing Bowling");
        cookChannel.notifyChanges("Fried Rice");
    }

}
