package utils;

public class MyQueue implements Container {
    private MyLinkedList<Object> linkedList = new MyLinkedList<>();

    public int getSize() {
        return linkedList.getSize();
    }

    public void push(Object obj) {
        linkedList.addLast(obj);
    }

    public Object pop() {
        return linkedList.getFirst();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }
}
