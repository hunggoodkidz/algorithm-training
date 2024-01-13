package DataStructure.LinkedList.SinglyLinkedList;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Thêm một phần tử vào đầu danh sách
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Đọc (in) danh sách
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
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
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

        System.out.println("Không tìm thấy giá trị cần xóa.");
    }
}
