package kz.f12.school.utils;

public interface Container<T> {
    int getSize();
    void push(T obj);
    T pop();
    boolean isEmpty();
}
