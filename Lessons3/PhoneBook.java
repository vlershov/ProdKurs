package Lessons3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private static final HashMap<String, Person> phoneBook = new HashMap<>();

    public static void add(Person person) {
        phoneBook.put(person.getSurName(), person);
    }

    public static ArrayList<String> getPhone(String personSurName){
        return phoneBook.get(personSurName).getPhones();
        }


    public static ArrayList<String> getEmails(String personSurName) {
        return phoneBook.get(personSurName).getEmails();
    }
}
