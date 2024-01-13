package DataStructure.LinkedList;

import DataStructure.LinkedList.SinglyLinkedList.SinglyLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class RaceCRUD {

    public static void main(String[] args){
        //Menu();

        showLinkedList();
    }


    public static void showLinkedList(){
        SinglyLinkedList myList = new SinglyLinkedList();

        // Thêm phần tử vào danh sách
        myList.addFirst(10);
        myList.addFirst(20);
        myList.addFirst(30);

        // Hiển thị danh sách
        myList.display(); // Output: 30 -> 20 -> 10 -> null

        // Cập nhật giá trị
        myList.update(20, 25);
        myList.display(); // Output: 30 -> 25 -> 10 -> null

        // Xóa một phần tử
        myList.delete(25);
        myList.display(); // Output: 30 -> 10 -> null
    }
    public static void Menu(){
        LinkedList<String> linkedList = new LinkedList<>();
        //head
        linkedList.add("Black People"); // node 1
        linkedList.add("White People"); // node 2
        linkedList.add("Asian People"); // node 3

        System.out.println("List: " + linkedList);
        Scanner scanner = new Scanner(System.in);
        String element;
        int position = 0 , menu = 0;
        while (true){
            System.out.println("\n RACE WAR OPERATIONS");
            System.out.println("1.Add an Element");
            System.out.println("2.Remove an Element");
            System.out.println("3.Update an Element");
            System.out.println("4.Display");
            System.out.println("5.Exit");

            System.out.println("Enter your choice");
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Enter Element ");
                    element= scanner.next();

                    System.out.println("At what position");
                    position = scanner.nextInt();
                    linkedList.add(position-1, element);
                    break;

                case 2:
                    System.out.print("Enter Position ");
                    position= scanner.nextInt();
                    linkedList.remove(position-1);
                    break;

                case 3:
                    System.out.print("Enter position ");
                    position= scanner.nextInt();

                    System.out.println( "Enter new Element");
                    element= scanner.nextLine();
                    linkedList.set(position-1, element);

                    break;
                case 4:
                    System.out.println("List=");
                    Iterator it= linkedList.iterator();
                    while (it.hasNext()){
                        System.out.print(it.next()+" ");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("wrong choice");

            }
        }

    }

    public static void Shit(){

        LinkedList<String> lls=new LinkedList<>();

        //add some names to linked list
        lls.add("India");
        lls.add("America");
        lls.add("Japan");

        System.out.println("List="+lls);

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String element;
        int position,choice=0;

        while (choice<4){
            System.out.println("\n INKEDLIST OPERATIONS");
            System.out.println("1.Add an Element");
            System.out.println("2.Remove an Element");
            System.out.println("3.Change an Element");
            System.out.println("4.Display");
            System.out.println("5.Exit");


            System.out.println("Enter your choice");
            try {
                choice=Integer.parseInt(br.readLine());
                switch(choice){
                    case 1:
                        System.out.println("Enter Element ");
                        element=br.readLine();

                        System.out.println("At what position");
                        position=Integer.parseInt(br.readLine());
                        lls.add(position-1, element);
                        break;

                    case 2:
                        System.out.print("Enter Position ");
                        position=Integer.parseInt(br.readLine());
                        lls.remove(position-1);
                        break;

                    case 3:
                        System.out.print("Enter position ");
                        position=Integer.parseInt(br.readLine());

                        System.out.println( "Enter new Element");
                        element=br.readLine();
                        lls.set(position-1, element);

                        break;
                    case 4:
                        System.out.println("List=");
                        Iterator it=lls.iterator();
                        while (it.hasNext()){
                            System.out.print(it.next()+" ");
                        }
                        break;

                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("wrong choice");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
