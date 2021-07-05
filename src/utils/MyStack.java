package utils;

public class MyStack implements Container {
    private Object[] values = new Object[10];
    private int size;

    public int getSize() {
        return size;
    }

    public void push(Object obj) {
        if (size + 1 > values.length) {
            resize();
        }
        values[size++] = obj;
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        } else {
            return values[--size];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        Object[] newArray = new Object[values.length * 2];
        for (int i = 0; i < values.length; i++) {
            newArray[i] = values[i];
        }
        values = newArray;
    }
}
