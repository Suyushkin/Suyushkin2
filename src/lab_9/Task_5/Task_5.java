package lab_9.Task_5;

public class Task_5 {
    public static void main(String[] args) {
        Node head = null;
        for (int i = 0; i <= 3; i++) {
            head = new Node(i, head);
        }

        System.out.println("Список с головы:");
        display(head);

        System.out.println();

        Node tail = null;
        for (int i = 0; i <= 3; i++) {
            if (tail == null) {
                tail = new Node(i);
                continue;
            }

            Node ref = tail;
            while (ref.next != null) {
                ref = ref.next;
            }
            ref.next = new Node(i);
        }

        System.out.println("Список с хвоста:");
        display(tail);
    }

    public static void display(Node node) {
        Node ref = node;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
