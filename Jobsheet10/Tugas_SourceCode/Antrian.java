package Jobsheet10.Tugas_SourceCode;

public class Antrian {
    private final int maxSize = 10;
    private Mahasiswa[] queue = new Mahasiswa[maxSize];
    private int front = 0;
    private int rear = -1;
    private int nItems = 0;
    private int processedCount = 0;
    private final int maxProcessed = 30;

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public void clear() {
        front = 0;
        rear = -1;
        nItems = 0;
        processedCount = 0;
        queue = new Mahasiswa[maxSize];
    }

    public void enqueue(Mahasiswa m) {
        if (!isFull()) {
            if (rear == maxSize - 1) rear = -1;
            queue[++rear] = m;
            nItems++;
        } else {
            System.out.println("Antrian penuh!");
        }
    }

    public Mahasiswa[] dequeueTwo() {
        if (nItems < 2) {
            System.out.println("Minimal 2 mahasiswa dalam antrian");
            return null;
        }
        
        Mahasiswa[] temp = {queue[front], queue[front+1]};
        front += 2;
        nItems -= 2;
        processedCount += 2;
        
        if (front >= maxSize) front -= maxSize;
        return temp;
    }

    public void displayAll() {
        System.out.println("\nDaftar Antrian:");
        for (int i = 0; i < nItems; i++) {
            int pos = (front + i) % maxSize;
            queue[pos].display();
        }
    }

    public void displayFrontTwo() {
        System.out.println("\n2 Antrian Terdepan:");
        for (int i = 0; i < 2 && i < nItems; i++) {
            int pos = (front + i) % maxSize;
            queue[pos].display();
        }
    }

    public void displayRear() {
        if (!isEmpty()) {
            System.out.println("\nAntrian Terakhir:");
            queue[rear].display();
        }
    }

    public int count() { 
        return nItems; 
    }

    public int getProcessed() {
        return processedCount; 
    }
    
    public int getRemaining() { 
        return maxProcessed - processedCount; 
    }
}
