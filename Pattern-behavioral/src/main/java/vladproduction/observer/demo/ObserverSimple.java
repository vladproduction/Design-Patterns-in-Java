package vladproduction.observer.demo;

import java.util.Observable;
import java.util.Observer;

public class ObserverSimple {
    public static void main(String[] args) {
        SocialNetwork socialNetworkStream = new SocialNetwork();
        Client client1 = new Client("Henry");
        Client client2 = new Client("Olivia");

        socialNetworkStream.addObserver(client1);
        socialNetworkStream.addObserver(client2);

        socialNetworkStream.someoneTweeted();
    }
}
//concrete subject
class SocialNetwork extends Observable {
    public void someoneTweeted(){
        setChanged();
        notifyObservers();
    }
}
//concrete observer
class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream, someone tweeted something.");
    }
}

