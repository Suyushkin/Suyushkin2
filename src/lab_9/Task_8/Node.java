package lab_9.Task_8;

public class Node {
    public int value;
    public Node next;
    private Node node;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    Node(int value) {
        this.value = value;
        this.next = null;
    }

    Node() {
        this.node = null;
    }

    public void createHead(int value) {
        this.node = new Node(value, this.node);
    }

    public void createTail(int value) {
        if (this.node == null) {
            this.node  = new Node(value);
            return;
        }

        Node ref = this.node;
        while (ref.next != null)
            ref = ref.next;
        ref.next = new Node(value);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node ref = this.node;
        while (ref != null) {
            result.append(ref.value).append(" ");
            ref = ref.next;
        }
        return result.toString();
    }

    public void addFirst(int value) {
        createHead(value);
    }

    public void addLast(int value) {
        createTail(value);
    }

    public void insert(int index, int value) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Индекс не может быть отрицательным");
        if (index == 0) {
            createHead(value);
            return;
        }
        Node newNode = new Node(value);
        Node ref = this.node;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }
        if (ref == null)
            throw new IndexOutOfBoundsException("Индекс вышел за пределы допустимого");
        newNode.next = ref.next;
        ref.next = newNode;
    }

    public void removeFirst() {
        if (this.node == null)
            return;
        this.node = this.node.next;
    }

    public void removeLast() {
        if (this.node == null || this.node.next == null) {
            this.node = null;
            return;
        }
        Node ref = this.node;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void removeIndex(int index) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Индекс не может быть отрицательным");
        if (index == 0) {
            removeFirst();
            return;
        }
        Node ref = this.node;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }
        if (ref == null || ref.next == null)
            throw new IndexOutOfBoundsException("Индекс вышел за пределы допустимого");
        ref.next = ref.next.next;
    }

    public void remove() {
        this.node = null;
    }

    public void createHeadRec(int value) {
        addFirst(value);
    }

    public void createTailRec(int value) {
        this.node = createTailRecHelper(this.node, value);
    }

    private Node createTailRecHelper(Node node, int value) {
        if (node == null)
            return new Node(value);
        node.next = createTailRecHelper(node.next, value);
        return node;
    }

    public String toStringRec() {
        return toStringRecHelper(this.node);
    }

    private String toStringRecHelper(Node node) {
        if (node == null)
            return "";
        return node.value + " " + toStringRecHelper(node.next);
    }

}
