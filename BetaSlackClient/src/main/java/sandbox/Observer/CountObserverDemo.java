package sandbox.Observer;

public class CountObserverDemo {
    public static void main(String[] args) throws InterruptedException {
        InputProvider inputProvider = new InputProvider();
        MyTimer myTimer = new MyTimer();
        inputProvider.attach(myTimer);
        myTimer.start();
        while (true) {
            String input = inputProvider.getInput();

            if(input.equals("q")) {
                break;
            }

            System.out.println(input);
        }
        myTimer.join();
        System.out.println("Main thread exited");
    }
}
