public class DataDosen08 {
    
    public void dataSemuaDosen(Dosen08[] arrayOfDosen) {
        System.out.println("Data Semua Dosen:");
        for (Dosen08 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria: " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int countPria = 0;
        int countWanita = 0;

        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria: " + (countPria > 0 ? (double) totalUsiaPria / countPria : 0));
        System.out.println("Rata-rata Usia Dosen Wanita: " + (countWanita > 0 ? (double) totalUsiaWanita / countWanita : 0));
    }

    public void infoDosenPalingTua(Dosen08[] arrayOfDosen) {
        Dosen08 dosenPalingTua = arrayOfDosen[0];

        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia > dosenPalingTua.usia) {
                dosenPalingTua = dosen;
            }
        }

        System.out.println("Dosen Paling Tua:");
        dosenPalingTua.tampilkanInfo();
    }

    public void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        Dosen08 dosenPalingMuda = arrayOfDosen[0];

        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia < dosenPalingMuda.usia) {
                dosenPalingMuda = dosen;
            }
        }

        System.out.println("Dosen Paling Muda:");
        dosenPalingMuda.tampilkanInfo();
    }
}
