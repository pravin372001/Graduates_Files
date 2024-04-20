import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AlivePersons {
    public static void main(String[] args) {
        Map<String, Integer[]> birthAndDeathYears = new HashMap<>();
        List<Person> persons = new ArrayList<>();
        initailize(persons);
        initailize(birthAndDeathYears);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year :");
        int year = scanner.nextInt();
        // List<String> alivePersons = alivePersons(year, birthAndDeathYears);
        List<String> alivePersons = alivePersons(persons, year);// Using User defined class
        if (alivePersons.size() == 0) {
            System.out.println("No person Alive on that year");
        } else {
            System.out.println(alivePersons);
        }
        scanner.close();
    }

    public static List<String> alivePersons(int year, Map<String, Integer[]> birthYear) {
        List<String> alivePersons = new ArrayList<String>();
        for (Map.Entry<String, Integer[]> entry : birthYear.entrySet()) {
            if (entry.getValue()[0] <= year && entry.getValue()[1] >= year) {
                alivePersons.add(entry.getKey());
            }
        }
        return alivePersons;
    }

    public static List<String> alivePersons(List<Person> persons, int year) {// Using User defined class
        List<String> alivePersons = new ArrayList<String>();
        for (Person person : persons) {
            if (person.getBirthYear() <= year && person.getDeathYear() >= year) {
                alivePersons.add(person.getName());
            }
        }
        return alivePersons;
    }

    public static void initailize(List<Person> persons) { // Using User defined class
        persons.add(new Person("Person A", 1920, 1960));
        persons.add(new Person("Person B", 1925, 1970));
        persons.add(new Person("Person C", 1930, 1980));
        persons.add(new Person("Person D", 1935, 1988));
        persons.add(new Person("Person E", 1940, 1999));
        persons.add(new Person("Person F", 1945, 1977));
        persons.add(new Person("Person G", 1937, 1962));
        persons.add(new Person("Person H", 1937, 1962));
        persons.add(new Person("Person I", 1922, 1959));
        persons.add(new Person("Person J", 1910, 1954));
    }

    public static void initailize(Map<String, Integer[]> birthAndDeathYears) {
        birthAndDeathYears.put("Person A", new Integer[] { 1920, 1960 });
        birthAndDeathYears.put("Person B", new Integer[] { 1925, 1970 });
        birthAndDeathYears.put("Person C", new Integer[] { 1930, 1980 });
        birthAndDeathYears.put("Person D", new Integer[] { 1935, 1988 });
        birthAndDeathYears.put("Person E", new Integer[] { 1940, 1999 });
        birthAndDeathYears.put("Person G", new Integer[] { 1945, 1977 });
        birthAndDeathYears.put("Person H", new Integer[] { 1937, 1962 });
        birthAndDeathYears.put("Person I", new Integer[] { 1922, 1959 });
        birthAndDeathYears.put("Person J", new Integer[] { 1910, 1954 });
    }
}
