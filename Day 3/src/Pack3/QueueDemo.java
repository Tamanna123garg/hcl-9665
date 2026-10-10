package Pack3;

class Queue {
    int[] arr;
    int front;
    int rear;
    int size;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }


    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        arr[++rear] = data;
        System.out.println(data + " inserted");
    }


    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(arr[front] + " removed");
        front++;
    }


    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        q.dequeue();

        q.display();
    }
}