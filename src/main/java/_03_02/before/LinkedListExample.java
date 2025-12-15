package _03_02.before;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        System.out.println("LinkedList: " + linkedList);
        

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.poll());
        System.out.println(linkedList.pop()); //Throws exception if empty
    }

}
