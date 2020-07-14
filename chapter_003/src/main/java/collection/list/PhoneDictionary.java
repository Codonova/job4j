package collection.list;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> rsl = new ArrayList<>();
        Predicate<Person> findByName = (name) -> name.getName().equals(key);
        Predicate<Person> findBySurname = (surname) -> surname.getSurname().equals(key);
        Predicate<Person> findByPhone = (phone) -> phone.getPhone().equals(key);
        Predicate<Person> findByAddress = (address) -> address.getAddress().equals(key);
        Predicate<Person> combine = findByName.or(findBySurname.or(findByPhone.or(findByAddress)));

       /* for (Person data : this.persons) {
           if (data.getName().contains(key) || data.getSurname().contains(key) || data.getAddress().contains(key) || data.getAddress().contains(key)) {
               rsl.add(data);
           }
        }
        */

        for (Person person : this.persons) {
            if (combine.test(person)) {
                rsl.add(person);
            }
        }
        return rsl;
    }
}
