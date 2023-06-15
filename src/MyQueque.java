import java.util.Arrays;

public class MyQueque<T> {
    int[] queue;
        private int capacity;
        private int size;
        int front;
        int rear;
        int nullCount = 0;

        public MyQueque(int capacity) {
            this.queue = new int[capacity];
            this.capacity = capacity;
            this.size = 0;
            this.front = 0;
            this.rear = -1;
        }

    public void enqueue(T item) {
        if (isFull()) {
            increaseCapacity();
        }
        rear = (rear + 1) % capacity;
        queue[rear] = (int) item;
        size++;
    }

    private boolean isFull() {
            return size == capacity;
        }

        private void increaseCapacity() {
            int newCapacity = capacity + 1;
            int[] newQueue = new int[newCapacity];

            int i = front;
            int j = 0;
            while (i != rear) {
                newQueue[j] = queue[i];
                i = (i + 1) % capacity;
                j++;
            }
            newQueue[j] = queue[rear];

            queue = newQueue;
            capacity = newCapacity;
            front = 0;
            rear = j;
        }
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Nothing to dequeue.");
        }
        int removedItem = queue[front];
        queue[front] = 0;
        front = (front + 1) % capacity;
        size--;
        return removedItem;
    }
    private boolean isEmpty() {
        return size == 0;
    }

    public void enqueueMultiple(T... items) {
        for (T item : items) {
            enqueue(item);
        }
    }


    public int size(){
            return size;
    }
    public int getCapacity(){
            return capacity;
    }

    public void getAll() {
        for (Object queues : queue) {
            if (queues == null) {
                break;
            }
        }
        System.out.println(Arrays.toString(queue));

    }
    }

