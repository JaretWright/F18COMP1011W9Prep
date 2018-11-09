import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args)
    {
        Student student1 = new Student("Barry",88);
        Student student2 = new Student("Charlie",89);
        Student student3 = new Student("Ben",73);
        Student student4 = new Student("Tomoya",98);
        Student student5 = new Student("Taylon",95);
        Student student6 = new Student("Virginia",96);

        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);
        treeSet.add(student6);

        for (Student student:treeSet)
            System.out.printf("Student: %s%n", student);

        System.out.printf("%n%nThe first element is: %s%n", treeSet.first());
        System.out.printf("The last element is: %s%n%n", treeSet.last());

        Iterator<Student> headSelector = treeSet.headSet(student5).iterator();
        while(headSelector.hasNext())
            System.out.println("before student 5: " + headSelector.next().toString());


        Iterator<Student> tailSelector = treeSet.tailSet(student5).iterator();
        while(tailSelector.hasNext())
            System.out.println("student 5 and beyond: " + tailSelector.next().toString());
    }
}
