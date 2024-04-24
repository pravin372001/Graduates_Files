import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;

import model.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("John", "Doe");
        String json = new App().serialize(person);
        Person person2 = new App().deserialize();
        System.out.println(person2);
    }

    public String serialize(Person person) {
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);

        try (FileWriter writer = new FileWriter("person1.json")) {
            writer.write(json);
            System.out.println("JSON data written to person.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    public Person deserialize() throws IOException {
        Gson gson = new Gson();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("person1.json"));
        while (bufferedReader.ready()) {
            Person person = gson.fromJson(bufferedReader, Person.class);
            System.out.println(person);
        }
        bufferedReader.close();
        return null;
    }
}
