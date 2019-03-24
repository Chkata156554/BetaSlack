package sandbox.Observer;

public interface MyTimerCVVO {
    void attach(MyTimerObserver observer);
    void unsubscribe(MyTimerObserver observer);
    void notifyAllObservers();
}
