public class DataMahasiswa {
    public String nama;
    public String nim;
    public String tahunMasuk;
    public double nilaiUTS;
    public double nilaiUAS;

    public DataMahasiswa(String nama, String nim, String tahunMasuk, double nilaiUAS, double nilaiUTS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public void tambahData(String nama, String nim, String tahunMasuk, double nilaiUAS, double nilaiUTS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    public static double cariUTSTertinggi(DataMahasiswa[] arr, int low, int high) {
        if (low == high) {
            return arr[low].nilaiUTS;
        }
        
        int mid = (low + high) / 2;
        double leftMax = cariUTSTertinggi(arr, low, mid);
        double rightMax = cariUTSTertinggi(arr, mid + 1, high);
        
        return Math.max(leftMax, rightMax);
    }

    
    public static double cariUTSTerendah(DataMahasiswa[] arr, int low, int high) {
        if (low == high) {
            return arr[low].nilaiUTS;
        }
        
        int mid = (low + high) / 2;
        double leftMin = cariUTSTerendah(arr, low, mid);
        double rightMin = cariUTSTerendah(arr, mid + 1, high);
        
        return Math.min(leftMin, rightMin);
    }

    
    public static double hitungRataUAS(DataMahasiswa[] arr) {
        double total = 0;
        for (DataMahasiswa mhs : arr) {
            total += mhs.nilaiUAS;
        }
        return total / arr.length;
    }
    
}
