package Jobsheet14.SourceCode_Praktikum;

public class BinaryTreeArray08 {
    Mahasiswa08[] dataMahasiswa;
    int idxLast; // Menunjukkan indeks terakhir yang valid di array

    public BinaryTreeArray08(){
        // Inisialisasi array dengan ukuran tetap, misalnya 100
        // Ukuran array harus cukup besar untuk menampung pohon
        this.dataMahasiswa = new Mahasiswa08[100];
        this.idxLast = -1; // -1 menandakan array masih kosong
    }

    // Method untuk mengisi data awal (dari Jobsheet asli)
    void populateData(Mahasiswa08 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    // method add(Mahasiswa data) untuk memasukan data ke dalam binary tree
    // Ini mengasumsikan kita membangun complete binary tree dalam array
    // bukan BST (Binary Search Tree)
    public void add(Mahasiswa08 data) {
        // Cek apakah array masih punya tempat
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++; // Tambahkan indeks terakhir
            dataMahasiswa[idxLast] = data; // Masukkan data di posisi berikutnya
            System.out.println("Mahasiswa " + data.nama + " ditambahkan pada indeks " + idxLast);
        } else {
            System.out.println("Array penuh, tidak dapat menambahkan data baru.");
        }
    }

    // Method traverseInOrder()
    void traverseInOrder(int idxStart){
        // Pastikan indeks masih dalam batas data yang valid
        if (idxStart <= idxLast) {
            // Pastikan data di indeks saat ini tidak null (node ada)
            if (dataMahasiswa[idxStart] != null) {
                // Rekursif ke anak kiri
                traverseInOrder(2 * idxStart + 1);
                // Kunjungi node saat ini
                dataMahasiswa[idxStart].tamplInformasi();
                // Rekursif ke anak kanan
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // method traversePreOrder()
    // Ini adalah public wrapper method untuk memulai traversal dari root (indeks 0)
    public void traversePreOrder() {
        System.out.println("\nPreOrder Traversal Mahasiswa (Array) : ");
        // Memanggil helper method rekursif
        traversePreOrder(0);
    }

    // Private helper method rekursif untuk pre-order traversal
    private void traversePreOrder(int idxStart) {
        // Pastikan indeks masih dalam batas data yang valid
        if (idxStart <= idxLast) {
            // Pastikan data di indeks saat ini tidak null (node ada)
            if (dataMahasiswa[idxStart] != null) {
                // Kunjungi node saat ini (Pre-order: Node -> Left -> Right)
                dataMahasiswa[idxStart].tamplInformasi();
                // Rekursif ke anak kiri
                traversePreOrder(2 * idxStart + 1);
                // Rekursif ke anak kanan
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}