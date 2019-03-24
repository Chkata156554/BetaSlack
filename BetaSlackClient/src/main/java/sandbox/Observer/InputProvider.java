package sandbox.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputProvider implements MyTimerCVVO {

    private final Scanner scanner = new Scanner(System.in);

    public String getInput() {
        String input = scanner.nextLine();

        if(input.equals("q")){
            notifyAllObservers();
        }
        return input;
    }

    private final List<MyTimerObserver> observers = new ArrayList<>();


    public void attach(MyTimerObserver observer) {
        observers.add(observer);

    }

    @Override
    public void unsubscribe(MyTimerObserver observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers(){
        observers.forEach(observer -> observer.detouch());
        }
    }

