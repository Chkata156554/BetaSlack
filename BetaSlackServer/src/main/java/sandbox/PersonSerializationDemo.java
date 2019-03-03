package sandbox;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class PersonSerializationDemo {
    public static void main(String[] args) throws JsonProcessingException {


        Person person = new Person("John", "Smith", 30);
        Purchase purchase = new Purchase("Laptop",5234.99);
        person.addInteger(1);
        person.addPurchase(purchase);


        ObjectMapper objectMapper = new ObjectMapper();


        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);


        String serialized = objectMapper.writeValueAsString(person);
        System.out.println(serialized);


    }
}
