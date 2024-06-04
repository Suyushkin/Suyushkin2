package lab_9.Task_8;

public class Task_8 {
    public static void main(String[] args) {
        Node list_1 = new Node();
        list_1.createHead(3);
        list_1.createHead(2);
        list_1.createHead(1);
        list_1.createTail(4);
        list_1.createTail(5);
        System.out.println("List: " + list_1.toString());
        list_1.addFirst(0);
        list_1.addLast(6);
        System.out.println("Add first and last: " + list_1.toString());
        list_1.insert(2, 10);
        System.out.println("Insert index 2: " + list_1.toString());
        list_1.removeFirst();
        list_1.removeLast();
        System.out.println("Remove first and last: " + list_1.toString());
        list_1.removeIndex(2);
        System.out.println("Remove index 2: " + list_1.toString());
        list_1.remove();
        System.out.println("Remove all: " + list_1.toString());

        System.out.println();

        Node list_2 = new Node();
        list_2.createHeadRec(3);
        list_2.createHeadRec(2);
        list_2.createHeadRec(1);
        list_2.createTailRec(4);
        list_2.createTailRec(5);
        System.out.println("List: " + list_2.toStringRec());
    }
}
