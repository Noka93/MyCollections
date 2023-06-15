import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StackTest {
    private Stack stack;
    @BeforeEach
    public void setUp(){
        stack = new Stack();
    }

    @Test
    void push() {
        stack.push(4);
        stack.push(5);
        stack.push(6);
        assertEquals(3, stack.getSize());
    }

    @Test
    void pop() {
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        assertEquals(2, stack.getSize());
    }

    @Test
    void search(){
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.search(5);
        assertTrue(stack.search(5));
    }

    @Test
    void peek() {
        stack.push(4);
        stack.push(5);
        stack.push(6);
        assertEquals(6, stack.peek());
    }

    @Test
    void isEmpty(){
        stack.push(4);
        stack.push(5);
        stack.push(6);
        assertFalse(stack.isEmpty());
    }

}