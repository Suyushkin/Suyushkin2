package lab_9.Task_4;

public class Task_4 {
    public static void main(String[] args) {
        Node node_1 = new Node(1, null);
        Node node_2 = new Node(2, null);
        Node node_3 = new Node(3, null);

        node_1.next = node_2;
        node_2.next = node_3;

        Node ref = node_1;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
