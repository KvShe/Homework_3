package Homeworks.Homework_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 3. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи.
 * С помощью метода get() искать номер телефона по фамилии. Следует учесть,
 * что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class PhoneBook {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Jonny", "1234");
        phoneBook.add("Arthur", "5678");
        phoneBook.add("Sady", "123");
        phoneBook.add("Sady", "321");

        System.out.println(phoneBook.get("Jonny"));
        System.out.println(phoneBook.get("Arthur"));
        System.out.println(phoneBook.get("Sady"));
    }
    private final Map<String, List<String>> CONTACT_LIST = new HashMap<>();

    public void add(String name, String number) {
        if (!CONTACT_LIST.containsKey(name)){
            CONTACT_LIST.put(name, new ArrayList<>());
            CONTACT_LIST.get(name).add(number);
        } else {
            CONTACT_LIST.get(name).add(number);
        }
    }
    public List<String> get(String name) {
        return CONTACT_LIST.get(name);
    }
}
