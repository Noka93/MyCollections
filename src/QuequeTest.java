import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuequeTest {

    private Queque queque;

    @BeforeEach
    public void setUp(){
        queque = new Queque();
    }

    @Test
    void offer() {
        queque.offer("Rice");
        queque.offer("Beans");
        queque.offer("Melon");
        queque.offer("Bread");
        queque.getAll();
        assertEquals(4, queque.size());
    }

    @Test
    void add() {
        queque.offer("Rice");
        queque.offer("Beans");
        queque.offer("Melon");
        queque.offer(1);
        queque.getAll();
        assertEquals(4, queque.size());

    }

    @Test
    void poll() {
        queque.offer("Rice");
        queque.offer("Beans");
        queque.offer("Melon");
        queque.offer(1);
        queque.poll();
        queque.getAll();
        assertEquals(3, queque.size());

    }

    @Test
    void remove() {
        queque.offer("Rice");
        queque.offer("Beans");
        queque.offer("Melon");
        queque.offer(1);
        queque.remove();
        queque.getAll();
        assertEquals(3, queque.size());

    }

    @Test
    void element() {
        queque.offer("Rice");
        queque.offer("Beans");
        queque.offer("Melon");
        queque.element();
        queque.getAll();
        assertEquals(3, queque.size());

    }

    @Test
    void peek() {
    }
}