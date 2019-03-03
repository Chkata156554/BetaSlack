package sandbox.Lambdas;

import sandbox.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("A","B", 20),
                new Person("C","D", 16),
                new Person("E","F", 55)
        );

        List<Person>adults = new ArrayList<>();
        //for(Person person : people){
          //  if(person.getAge() >= 18)
            //    adults.add(person);
        //}

        //parallel do wielu wątków
        List<Person> adults2 = people.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());

        adults2.forEach(x -> System.out.println(x.getName()));


     //   for (Person person :adults) {
       //     System.out.println(person.getName());
        //}
    }

       /** Checker evenChecker = x -> x % 2 == 0;
         /**= new Checker() {
            @Override
            public boolean check(int number){
                return number % 2 == 0;
            }
        };

        Checker oddChecker = x -> x % 2 == 1;

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        filter(numbers, x -> x % 2 == 0);
        System.out.println();
        filter(numbers, x -> x % 2 == 1);
        filter(numbers, x -> {
            int expectedValue = 0;
            return x % 2 == expectedValue;
        });

        for (int number : numbers){
            if(evenChecker.check(number)){
                System.out.println(number);
            }

        }
    }
    private static void filter(List<Integer> list, Checker checker){
        for(int element : list) {
            if (checker.check(element)){
                System.out.println(element);
            }
        }*/
}

