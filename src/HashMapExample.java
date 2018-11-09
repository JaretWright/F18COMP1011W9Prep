import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class HashMapExample {
    private static TreeMap<String, LinkedList> phoneBook;
    public static void main(String[] args)
    {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Fred","705-555-1234");
        contacts.put("Betty","416-555-7893");
        contacts.put("Arnold","905-665-1238");
        contacts.put("Arnold","416-665-1239");

        for (String key: contacts.keySet())
        {
            System.out.printf("key: %-8s    Value: %s%n", key, contacts.get(key));
        }

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Fred","705-555-1234");
        treeMap.put("Betty","416-555-7893");
        treeMap.put("Arnold","905-665-1238");

        System.out.println("\nAs a TreeMap - it should be sorted");
        for (String key: treeMap.keySet())
        {
            System.out.printf("key: %-8s    Value: %s%n", key, treeMap.get(key));
        }

        phoneBook = new TreeMap<>();
        addContact("Jaret","Wright","705-555-1234");
        addContact("Betty", "White","416-222-9834");
        addContact("Terry","Downs", "777-222-9876");
        addContact("Mike","Waltz", "905-223-7654");

        for (String key: phoneBook.keySet())
        {
            LinkedList<Contact> tempList = phoneBook.get(key);
            for (Contact contact : tempList)
                System.out.printf("Key: %s Contact: %s%n", key, contact);
        }
    }

    public static void addContact(String firstName, String lastName, String phoneNum)
    {
        Contact newContact = new Contact(firstName, lastName, phoneNum);
        String firstLetter = lastName.substring(0, 1);

        if (!phoneBook.containsKey(firstLetter)){
            LinkedList<Contact> ll = new LinkedList<>();
            ll.add(newContact);
            phoneBook.put(firstLetter, ll);
        }
        else    //the key already exists
        {
            phoneBook.get(firstLetter).add(newContact);
        }
    }

}
