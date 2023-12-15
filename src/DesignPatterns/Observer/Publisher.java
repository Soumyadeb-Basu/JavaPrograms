package DesignPatterns.Observer;

interface Publisher {

    void subscribe(Observer ob);
    void unsubscribe(Observer ob);

    void notifyChanges(String title);
}
