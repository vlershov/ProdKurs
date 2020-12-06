package Lessons3;

import java.util.ArrayList;

public class Person {

    public static final ArrayList<Person> PERSON_LIST = new ArrayList<>();
    private String surName;
    private final ArrayList<String> phones = new ArrayList<>();
    private final ArrayList<String> emails = new ArrayList<>();

    public Person(String surName, String phone, String eMail) {

        for (Person person: PERSON_LIST){

            if (person.getSurName().equals(surName)){

                this.phones.addAll(person.getPhones());
                this.emails.addAll(person.getEmails());
                break;
            }
        }
        this.surName = surName;
        this.phones.add(phone);
        this.emails.add(eMail);
        PERSON_LIST.add(this);
    }

    public String getSurName() {return surName;}

    public ArrayList<String> getPhones() {return phones;}

    public ArrayList<String> getEmails() {return emails;}
}
