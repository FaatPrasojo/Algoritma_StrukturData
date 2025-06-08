package Jobsheet12.SourceCode_Tugas;

public class Queue {
    private Mahasiswa front;
    private Mahasiswa rear;
    private int size;
    private final int maxSize;

    public Queue(int maxSize) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size >= maxSize;
    }

    public boolean enqueue(String nim, String nama, String jurusan) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambah mahasiswa.");
            return false;
        }
        Mahasiswa newNode = new Mahasiswa(nim, nama, jurusan);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + nama + " berhasil mendaftar ke antrian.");
        return true;
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dapat dipanggil.");
            return null;
        }
        Mahasiswa removed = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("Mahasiswa " + removed.nama + " dengan NIM " + removed.nim + " dipanggil dari antrian.");
        return removed;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void dataPertama() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada data terdepan.");
        } else {
            System.out.println("Antrian terdepan: " + front.nama + " (NIM: " + front.nim + ", Jurusan: " + front.jurusan + ")");
        }
    }

    public void dataTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada data paling akhir.");
        } else {
            System.out.println("Antrian paling akhir: " + rear.nama + " (NIM: " + rear.nim + ", Jurusan: " + rear.jurusan + ")");
        }
    }

    public int count() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size);
        return size;
    }
}
