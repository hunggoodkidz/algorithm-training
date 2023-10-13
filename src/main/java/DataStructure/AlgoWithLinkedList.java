package DataStructure;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class AlgoWithLinkedList {


    public static void main(String[] args){
        //linkedlists();
        stacks();
        System.out.println();
        queueByNumber();
    }

    public static void linkedlists(){
        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person("Cai", 1));
        linkedList.add(new Person("Gi", 2));
        linkedList.add(new Person("vay", 3));
        linkedList.addFirst(new Person("Zero", 0));
        linkedList.addLast(new Person("Infinite", 999));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }

    public static void stacks(){
        // Last In First Out (LIFO)
        Stack<Person> stack = new Stack<>();
        Stack<Integer> stackNo = new Stack<>();

//        stack.push(new Person("Mot", 1));
//        stack.push(new Person("Hai", 2));
//        stack.push(new Person("Ba", 3));
        stackNo.push(1);
        stackNo.push(2);
        stackNo.push(3);

        System.out.println(stackNo); // [ 1 , 2 , 3]

        stackNo.pop(); // Remove

        System.out.println(stackNo); // [ 1 , 2 ] and 3 got removed


        System.out.println(stackNo.peek()); // Return from Last-in to First-out at [1,2] the Output: 2
        //System.out.println(stackNo.size());

    }

    public  static void queueByNumber(){

        Queue<Integer> queue =  new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue); // [1 , 2 , 3]
        queue.poll(); // dequeue
        System.out.println(queue); // [ 2, 3]
        queue.offer(4); // Push
        System.out.println(queue); // [2, 3 ,4 ]

    }

    public static void queues(){
        // Queue is a Interface, it's extend with polymorphism at other Collection Framework such as LinkedList, ArrayList
        Queue<Person> info = new LinkedList<>();

        info.add(new Person("Tao",1));
        info.add(new Person("Ký",2));
        info.add(new Person("Ngực",3));
        info.add(new Person("Fan",4));

        System.out.println(info.size());
        System.out.println(info.peek()); // In First at the Head/Front, Returns front element without removin
        System.out.println(info.poll()); // And wtf is this ? // Return to front element then delete
        System.out.println(info.size());
        System.out.println(info.peek());
        System.out.println(info.peek());
    }

    static record Person(String name, int status){} // What is record ?
}
