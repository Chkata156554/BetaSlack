package sandbox.Observer;

import java.util.Scanner;

public class TimerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exit = "exit";
        while (scanner.nextLine().equals(exit)) {
            System.out.println(exit);
        }
        scanner.nextLine();
    }
}
    /**Scanner scanner = new Scanner(System.in);

        while (true) {
        String input = scanner.nextLine();

        if(input.equals("exit")) {
            break;
        }

        System.out.println(input);
    }
}


}*/
