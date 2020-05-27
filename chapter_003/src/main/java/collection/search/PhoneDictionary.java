package collection.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> rsl = new ArrayList<Person>();
        for (Person data : this.persons) {
           if (data.getName().contains(key) || data.getSurname().contains(key) || data.getAddress().contains(key) || data.getAddress().contains(key)) {
               rsl.add(data);
           }
        }
        return rsl;
    }
}
