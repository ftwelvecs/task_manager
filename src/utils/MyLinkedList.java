package utils;

public class MyLinkedList<T> {

    private Node root;
    private int size;

    public int getSize() {
        return size;
    }

    public void addFirst(T obj) {
        if (root == null) {
            root = new Node(obj);
        } else {
            Node node = new Node(obj);
            node.next = root;
            root = node;
        }
        size++;
    }

    public void addLast(T obj) {
        if (root == null) {
            root = new Node(obj);
        } else {
            Node lastNode = root;
            Node node = root;
            while ((node = node.next) != null) {
                lastNode = node;
            }
            lastNode.next = new Node(obj);
        }
        size++;
    }

    public T getLast() {
        if (root != null) {
            Node currentNode = root;
            Node previousNode = root;
            Node lastNode = root;
            while ((currentNode = currentNode.next) != null) {
                if (currentNode.next != null)
                    previousNode = currentNode;
                lastNode = currentNode;
            }
            previousNode.next = null;
            size--;
            return lastNode.value;
        } else {
            return null;
        }
    }

    public T getFirst() {
        if (root != null) {
            T value = root.value;
            root = root.next;
            size--;
            return value;
        } else {
            return null;
        }
    }

    class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }
    }
}
