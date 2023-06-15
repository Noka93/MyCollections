import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQuequeTest {
    MyQueque<Object> myQueue;

    @BeforeEach
    public void setUp() {
        myQueue = new MyQueque(3);
    }

    @Test
    public void testEnqueue() {
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(50);
        myQueue.enqueue(40);
        myQueue.enqueue(4);
        myQueue.enqueue(55);
        myQueue.enqueue(60);
        myQueue.getAll();

        assertEquals(8, myQueue.size());
    }

    @Test
    public void testEnqueueMultiple() {
        myQueue.enqueueMultiple(10, 20, 30, 40, 50,80,54,9,34);

        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        System.out.println(myQueue.getCapacity());
        myQueue.getAll();
        assertEquals(0, myQueue.queue[0]);
        assertEquals(0, myQueue.queue[1]);
        assertEquals(0, myQueue.queue[2]);
        assertEquals(9, myQueue.getCapacity());
        assertEquals(3, myQueue.front);
        assertEquals(8, myQueue.rear);
    }
    @Test
    void capacity(){
        assertEquals(3,myQueue.getCapacity());

        myQueue.enqueueMultiple(1,2,3,34,5,6,7);

        assertEquals(7,myQueue.getCapacity());


    }

    @Test
    public void testDequeue() {
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(60);
        myQueue.enqueue(70);

        int removedItem = myQueue.dequeue();
//        System.out.println(myQueue.getCapacity());
        myQueue.getAll();

        assertEquals(10, removedItem);
        assertEquals(0, myQueue.queue[0]);
        assertEquals(20, myQueue.queue[1]);
        assertEquals(30, myQueue.queue[2]);
        assertEquals(5, myQueue.size());
        assertEquals(1, myQueue.front);
        assertEquals(5, myQueue.rear);
    }


}