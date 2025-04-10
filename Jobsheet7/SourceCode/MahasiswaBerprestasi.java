package Jobsheet7.SourceCode;

public class MahasiswaBerprestasi {
        Mahasiswa08 [] listMhs = new Mahasiswa08 [5];
        int idx;

    void tambah (Mahasiswa08 m) {
        if (idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil (){
        for (Mahasiswa08 m:listMhs){
            m.tampilInformasi();
            System.out.println("---------------------------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i <listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk>listMhs[j-1].ipk){
                    Mahasiswa08 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void SelectionSort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa08 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[idxMin] = tmp;
        }
    }

    // void insertionSort() {
    //     for (int i = 1; i < listMhs.length; i++) {
    //         Mahasiswa08 temp = listMhs[i];
    //         int j = i;
    //         while (j > 0 && listMhs[j-1].ipk > temp.ipk) {
    //             listMhs[j] = listMhs[j-1];
    //             j--;
    //         }
    //         listMhs[j] = temp;
    //     }
    // }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa08 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }   
    
    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos!=-1) {
            System.out.println("Data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + listMhs[pos].ipk + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return mid; // Ditemukan
            } else if (listMhs[mid].ipk < cari) { // Ubah tanda perbandingan
                return findBinarySearch(cari, left, mid - 1); // Cari di sebelah kiri
            } else {
                return findBinarySearch(cari, mid + 1, right); // Cari di sebelah kanan
            }
        }
        return -1; // Tidak ditemukan
    }
}
