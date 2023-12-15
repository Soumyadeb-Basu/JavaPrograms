package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Publisher{

    List<Observer> subscribers= new ArrayList<>();
    String nameChannel;

    public  YoutubeChannel(String nameChannel) {
        this.nameChannel= nameChannel;
    }
    @Override
    public void subscribe(Observer ob) {

        this.subscribers.add(ob);


    }

    @Override
    public void unsubscribe(Observer ob) {

        this.subscribers.remove(ob);

    }

    @Override
    public void notifyChanges(String title) {

        for(Observer ob: subscribers)
            ob.notified(title,nameChannel);

    }
}
