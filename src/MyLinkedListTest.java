import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList linkedList;

    @BeforeEach
    public void setUp() {
        linkedList = new MyLinkedList();

    }
    @Test
    public void testListIsEmpty(){
        assertTrue(linkedList.isEmpty());
        assertEquals(0, linkedList.size());
    }
    @Test
    public void testAdd(){
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        assertFalse(linkedList.isEmpty());
        assertEquals(3, linkedList.size());
    }

    @Test
    public void testRetrievingElement(){
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        assertEquals(2, linkedList.get(0));
        assertEquals(3, linkedList.get(1));
        assertEquals(4, linkedList.get(2));

    }

    @Test
    public void testRemovingElement(){
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.remove(3);

        assertEquals(2, linkedList.size());
        linkedList.remove(2);

        assertEquals(1, linkedList.size());
        assertEquals(4, linkedList.get(0));

        linkedList.remove(4);

        assertTrue(linkedList.isEmpty());
        assertEquals(0, linkedList.size());

    }

}