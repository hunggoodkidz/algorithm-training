package JavaCore;

import JavaCore.classses.Cup;

public class PassByValueReferenceExample {

    public static void passByValueBasic(int x){
        int a = 10; // 'a' là biến gốc với giá trị 10
        int b = a;  // 'b' là bản sao của 'a', nên b = 10

        // Thay đổi giá trị của 'b'
        b = 20;

        // In ra giá trị của 'a' và 'b'
        System.out.println("Giá trị của a: " + a); // Output: 10
        System.out.println("Giá trị của b: " + b); // Output: 20
    }

    // Phương thức nhận vào một biến kiểu int và cố gắng thay đổi giá trị của nó
    public static void modifyValue(int b) {
//        value = 20; // Thay đổi giá trị của biến cục bộ 'value'
//        System.out.println("Trong phương thức, giá trị của value: " + value); // Output: 20

        System.out.println("Copy from original value:" + b);
        b = 20;
        System.out.println("Value has modified: " + b);
    }

    // Phương thức nhận vào một mảng và thay đổi giá trị của phần tử đầu tiên
    public static void modifyArray(int[] array) {
        array[0] = 10; // Thay đổi giá trị của phần tử đầu tiên trong mảng
        System.out.println("Trong phương thức, giá trị của array[0]: " + array[0]); // Output: 10
    }

    public static void passByValue(){
        int originalValue = 10; // Khai báo biến gốc với giá trị 10

        System.out.println("Trước khi gọi phương thức, giá trị của originalValue: " + originalValue); // Output: 10

        // Gọi phương thức và truyền biến originalValue
        modifyValue(originalValue);

        System.out.println("Sau khi gọi phương thức, giá trị của originalValue: " + originalValue); // Output: 10
    }

    public static void passByReference(){
        // Tạo một mảng
        int[] originalArray = {1, 2, 3};

        System.out.println("Trước khi gọi phương thức, giá trị của originalArray[0]: " + originalArray[0]); // Output: 1

        // Gọi phương thức và truyền mảng
        modifyArray(originalArray);

        System.out.println("Sau khi gọi phương thức, giá trị của originalArray[0]: " + originalArray[0]); // Output: 10
    }

    public static void passByValue2(){

        int originalValue = 10;

        System.out.println("Original number: " + originalValue);

        modifyValue(originalValue);

        System.out.println("Is this orignal value?: "+ originalValue);

    }

    public static void fillCup(Cup cup) {
        cup.setState("is fulfilled"); // Thay đổi trạng thái của đối tượng cốc
    }

    public static void passByReference2(){

        Cup cup = new Cup("Empty");

        System.out.println("The current state of the Cup: " + cup.getState());

        fillCup(cup);

        System.out.println("The modified state of the Cup " + cup.getState());
    }


    public static void main(String[] args){
        //passByValue2();
        passByReference2();
//        Person person1 = new Person("Alice");
//
//        Person person2 = person1;
//
//        person2.name("bob");
//
//        System.out.println(person1);
//        System.out.println(person2);
    }



}
