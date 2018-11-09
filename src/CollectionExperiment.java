import java.util.*;

public class CollectionExperiment {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Fred");
        arrayList.add("Drew");
        arrayList.add("Amy");
        arrayList.add("Bart");
        arrayList.add(2, "Jaret");
        System.out.println(arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Fred");
        linkedList.add("Drew");
        linkedList.add("Amy");
        linkedList.add("Bart");

        System.out.println(linkedList);

        linkedList.add(2,"Jaret");
        System.out.println(linkedList);

        //so to the user, these appear similar, but under the hood, one is
        //more efficient for searching and the other is more efficient for
        //manipulating and changing

        HashSet<String> companyNames = new HashSet<>();
        companyNames.add("Watson");
        companyNames.add("Blackberry");

        companyNames.add("IBM");
        companyNames.add("IBM");
        companyNames.add("Jaret");
        companyNames.add("IBM");
        companyNames.add("IBM");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Watson");
        treeSet.add("Blackberry");
        treeSet.add("IBM");
        treeSet.add("IBM");
        treeSet.add("Jaret");

        System.out.println("HashSet:");
        displayList(companyNames);

        System.out.println("\nTreeSet:");
        displayList(treeSet);
    }

    public static void displayList(Collection<String> list)
    {
        for (String item: list)
            System.out.println(item);
    }

}
