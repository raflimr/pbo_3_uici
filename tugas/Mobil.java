package tugas;

public class Mobil {

    // Nilai attribute dari Class Mobil
    public int tahunKeluaran;
    public String namaMobil;
    public String warnaMobil;

    // Constructor
    public Mobil(int initialTahunKeluaran, String initialNamaMobil, String initialWarnaMobil) {
        tahunKeluaran = initialTahunKeluaran;
        namaMobil = initialNamaMobil;
        warnaMobil = initialWarnaMobil;
    }


    // Method with void
    public void tampilkanMobil() {
        System.out.println("Informasi Mobil:");
        System.out.println("Tahun Keluaran: " + tahunKeluaran);
        System.out.println("Nama Mobil: " + namaMobil);
        System.out.println("Warna Mobil: " + warnaMobil);
    }

    // Method with return value
    public String getDeskripsiMobil() {
        return "Mobil ini adalah " + namaMobil + " keluaran tahun " + tahunKeluaran + " dengan warna " + warnaMobil + ".";
    }

    // Method untuk mengatur nama mobil
    public void setNamaMobil(String nama) {
        namaMobil = nama;
    }

    // Method untuk mengatur warna mobil
    public void setWarnaMobil(String warna) {
        warnaMobil = warna;
    }

}