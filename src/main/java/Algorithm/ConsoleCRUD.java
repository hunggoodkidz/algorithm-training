package Algorithm;

import Algorithm.model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleCRUD {
    private static List<Item> items = new ArrayList<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("CRUD Operations:");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Select an operation (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createItem(scanner);
                    break;
                case 2:
                    readItems();
                    break;
                case 3:
                    updateItem(scanner);
                    break;
                case 4:
                    deleteItem(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void createItem(Scanner scanner) {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        Item item = new Item(nextId, name);
        items.add(item);
        nextId++;
        System.out.println("Item created with ID: " + item.getId());
    }

    private static void readItems() {
        System.out.println("List of Items:");
        for (Item item : items) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName());
        }
    }

    private static void updateItem(Scanner scanner) {
        System.out.print("Enter the ID of the item you want to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Item item : items) {
            if (item.getId() == id) {
                System.out.print("Enter the new name: ");
                String newName = scanner.nextLine();
                item = new Item(id, newName);
                System.out.println("Item updated successfully.");
                return;
            }else{
                System.out.println("Wrong ID or ID not valid, Please Try again!!");
                return;
            }
        }
        System.out.println("Item not found with ID: " + id);
    }

    private static void deleteItem(Scanner scanner) {
        System.out.print("Enter the ID of the item you want to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Item item : items) {
            if (item.getId() == id) {
                items.remove(item);
                System.out.println("Item deleted successfully.");
                return;
            }else{
                System.out.println("Wrong ID or ID not valid, Please Try again!!");
                return;
            }
        }
        System.out.println("Item not found with ID: " + id);
    }
}
