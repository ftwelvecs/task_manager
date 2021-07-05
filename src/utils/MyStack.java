package utils;

public class MyStack implements Container {
    private MyLinkedList<Object> linkedList = new MyLinkedList<>();

    public int getSize() {
        return linkedList.getSize();
    }

    public void push(Object obj) {
        linkedList.addLast(obj);
    }

    public Object pop() {
        return linkedList.getLast();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }
}
