package Jobsheet7.SourceCode;

public class DataDosen08 {
    Dosen08[] dataDosen = new Dosen08[5];
    int idx = 0;

    public void tambah(Dosen08 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    public void SortingASC() { // Bubble Sort untuk usia dari muda ke tua
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen08 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data telah diurutkan ASC berdasarkan usia.");
    }

    public void sortingDSC() { // Selection Sort untuk usia dari tua ke muda
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen08 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data telah diurutkan DSC berdasarkan usia.");
    }

    public void insertionSort() { // Insertion Sort untuk usia dari tua ke muda
        for (int i = 1; i < idx; i++) {
            Dosen08 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = key;
        }
        System.out.println("Data telah diurutkan menggunakan Insertion Sort.");
    }

    void PencarianDataSequential08(String nama) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama " + nama + ".");
        } else if (count == 0) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        }
    }

    void PencarianDataBinary08(int usia) {
        int left = 0;
        int right = idx - 1;
        int count = 0;
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
    
            if (dataDosen[mid].usia == usia) {
                dataDosen[mid].tampil();
                count++;
                // Cek untuk menemukan semua dosen dengan usia yang sama
                int temp = mid - 1;
                while (temp >= left && dataDosen[temp].usia == usia) {
                    dataDosen[temp].tampil();
                    count++;
                    temp--;
                }
                temp = mid + 1;
                while (temp <= right && dataDosen[temp].usia == usia) {
                    dataDosen[temp].tampil();
                    count++;
                    temp++;
                }
                break; // keluar dari loop setelah menemukan semua
            } else if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia " + usia + ".");
        } else if (count == 0) {
            System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
        }
    }
}
