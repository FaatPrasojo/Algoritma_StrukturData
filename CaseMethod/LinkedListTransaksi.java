public class LinkedListTransaksi {
    Node head;
    int size = 0;

    public void add(TransaksiLayanan data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public TransaksiLayanan get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node current = head;
        int count = 0;
        while (count < index) {
            current = current.next;
            count++;
        }
        return current.data;
    }

    // tugas UAS
    public TransaksiLayanan[] ambilTransaksiRange(int dari, int sampai) {
        if (dari < 1 || sampai < dari) {
            System.out.println("Range tidak valid");
            return new TransaksiLayanan[0];
        }

        TransaksiLayanan[] hasil = new TransaksiLayanan[sampai - dari + 1];
        Node current = head;
        int index = 1;
        int i = 0;

        while (current != null && index <= sampai) {
            if (index >= dari && i < hasil.length) {
                hasil[i] = current.data;
                i++;
            }
            current = current.next;
            index++;
        }

        if (i < hasil.length) {
            TransaksiLayanan[] hasilFix = new TransaksiLayanan[i];
            for (int j = 0; j < i; j++) {
                hasilFix[j] = hasil[j];
            }
            return hasilFix;
        }
        return hasil;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void tampilkaRiwayat() {
        if (isEmpty()) {
            System.out.println("Belum ada transaksi");

        }
        for (int i = 0; i < getSize(); i++) {
            TransaksiLayanan t = get(i);
            System.out.println((i + 1) + ". " + t.pasien.nama + " (" + t.durasiLayanan + " jam): Rp " + t.biaya);
        }
    }

}