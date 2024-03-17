package study.java;
public class Queue {
    int size, front, rear;
    int[] items;

    public Queue(int size) {
        front = -1;
        rear = -1;
        this.size = size;
        items = new int[size];
    }

    public void enqueue(int ele) {
        if (rear == size - 1) {
            System.out.println("Queue is full, insertion not allowed :-(");
        } else {
            rear++;
            items[rear] = ele;
            System.out.println("Element " + items[rear] + " is inserted in queue");
        }
        if (front == -1) {
            front = 0;
        }
    }

    public int dequeue() {
        {
            if (rear == -1 || front == -1) {
                System.out.println("Queue is empty, deletion not allowed :-(");
            } else {
                System.out.println("Element " + items[front] + " is deleted ");
            }
        }
        {
            if (rear == front) {
                rear = front = -1;
            } else {
                front = front++;
            }
        }
        return 0;
    }


}
