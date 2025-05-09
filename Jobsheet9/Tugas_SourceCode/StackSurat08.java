package Jobsheet9.Tugas_SourceCode;

public class StackSurat08 {

    int size;
    int top;
    Surat08[] data;

    public StackSurat08(int size) {
        this.size = size;
        data = new Surat08[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat08 surat) {
        if (!isFull()) {
            data[++top] = surat;
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat08 pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Stack surat kosong!");
            return null;
        }
    }

    public Surat08 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack surat kosong!");
            return null;
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat izin.");
        } else {
            for (int i = top; i >= 0; i--) {
                data[i].printSurat();
            }
        }
    }

    public boolean cariSurat(String namaMahasiswa) {
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat ditemukan:");
                data[i].printSurat();
                return true;
            }
        }
        System.out.println("Surat dengan nama " + namaMahasiswa + " tidak ditemukan.");
        return false;
    }
}
