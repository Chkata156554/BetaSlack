package sandbox.Observer;

import java.util.Scanner;
import java.util.Timer;

public class CounterDemo {
    public static void main(String[] args) {
        new Thread(() -> {
            int counter = 0;
            while (true) {
                System.out.println(++counter);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println(new Scanner(System.in).nextLine());
    }

}