// Class for Singly Linked List
class SinglyLinkedList {
    // Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the linked list

    // Constructor to initialize an empty list
    public SinglyLinkedList() {
        this.head = null;
    }

    // Insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;-
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete a node from the beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        head = head.next;
    }

    // Display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Main method to test the operations
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Linked List after insertions:");
        list.display();

        list.deleteFromBeginning();
        System.out.println("Linked List after deleting from beginning:");
        list.display();

        list = new SinglyLinkedList();
        System.out.println("New empty list");
        list.display();
        list.deleteFromBeginning();

    }
}