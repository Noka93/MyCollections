package solvingArray;
public class MyArrayList<T> {
    private Object[] lists;
    private int size;
    private static final int capacity = 5;
    public MyArrayList() {
        lists = new Object[capacity];
        size = 0;
    }

    public void add(T item) {
        if (size == lists.length) {
            addArrayCapacity();
        }
        lists[size++] = item;
    }
    public void removeByElement(T index) {
        int foundIndex = indexOf(index);
        if (size == lists.length){
            reduceArrayCapacity();
        }
        if (foundIndex >= 0) {
            for (int i = foundIndex; i < size; i++) {
                lists[i] = lists[i + 1];
            }
            lists[--size] = null;
        }
    }
    public void removeByIndex(int index) {
        if (index > size || index < 0) throw new IllegalArgumentException("index out of bound");
        for (int i = 0; i < lists.length; i++) {
            if (i == index) {
                for (int j = i; j < lists.length; j++) {
                    lists[j] = lists[j + 1];
                    if (j < lists.length - 1 && lists[j + 1] == null) break;
                }
            }
        }
        size--;
    }
    public void getAll() {
        for (Object list : lists) {
            if (list == null) {
                break;
            }
            System.out.println(list);
        }
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index out of bound");
        }
        return (T) lists[index];
    }

    public int size() {
        return size;
    }
    private int indexOf(T item) {
        for (int i = 0; i < size; i++) {
            if (lists[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    private void addArrayCapacity() {
        int newCapacity = lists.length * 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = lists[i];
        }
        lists = newArray;
    }


    private void reduceArrayCapacity() {
        int newCapacity = lists.length / 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = lists[i];
        }
        lists = newArray;
    }
    public boolean contain(T index) {
        for (Object list : lists) {
            if (list == index) return true;
        }
        return false;
    }
}


