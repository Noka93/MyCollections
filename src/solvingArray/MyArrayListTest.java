package solvingArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    void add() {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(19);
        arrayList.add(14);
        arrayList.add(30);
        arrayList.add(14);
        arrayList.add(14);
        arrayList.add(14);
        arrayList.add(14);
        arrayList.add(14);
        arrayList.add(14);
        arrayList.add(14);
        arrayList.add(14);
        assertEquals(15, arrayList.size());
    }

    @Test
    void addUsingString(){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Money");
        list.add("Love");
        list.add("Baby");
        assertEquals(3, list.size());
    }

    @Test
    void removeByElement() {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(30);
        arrayList.removeByElement(4);
        arrayList.removeByElement(5);
        assertEquals(4, arrayList.size());
        assertEquals(7, arrayList.get(0));

    }

    @Test
    void removeByIndex() {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(30);
        arrayList.removeByIndex(1);
        arrayList.removeByIndex(4);
        assertEquals(4, arrayList.size());
        assertEquals(4, arrayList.get(0));
    }

    @Test
    void getAll() {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.getAll();
        assertEquals(4, arrayList.size());
    }

    @Test

    void contain(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(7);
        assertTrue(arrayList.contain(7));
        assertFalse(arrayList.contain(12));
    }

    @Test
    void get(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(7);
        assertEquals(5, arrayList.get(1));
    }
}