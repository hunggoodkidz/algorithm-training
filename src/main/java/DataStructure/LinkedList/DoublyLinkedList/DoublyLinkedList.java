package DataStructure.LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Thêm một phần tử vào đầu danh sách
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Đọc (in) danh sách từ đầu đến cuối
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Đọc (in) danh sách từ cuối đến đầu
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    // Cập nhật giá trị của một phần tử
    public void update(int oldData, int newData) {
        Node current = head;
        while (current != null) {
            if (current.data == oldData) {
                current.data = newData;
                return;
            }
            current = current.next;
        }
        System.out.println("Không tìm thấy giá trị cần cập nhật.");
    }

    // Xóa một phần tử theo giá trị
    public void delete(int data) {
        if (head == null) {
            System.out.println("Danh sách rỗng.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            head.prev = null;
            return;
        }

        if (tail.data == data) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        Node current = head;
        while (current != null) {
            if (current.data == data) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                return;
            }
            current = current.next;
        }

        System.out.println("Không tìm thấy giá trị cần xóa.");
    }
}
