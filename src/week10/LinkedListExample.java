package week10;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> names =  new LinkedList<>();
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        ListIterator<String> iterator = names.listIterator();
        iterator.next();
        iterator.next();
        iterator.add("Ray");

        iterator.previous();
        iterator.remove();
        System.out.println("\n");
        iterator = names.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        names.add("Kay");
        System.out.println("\n");
        iterator = names.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
