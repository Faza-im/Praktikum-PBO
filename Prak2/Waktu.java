package Prak2;

public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    // Constructor
    public Waktu(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    // Getter and Setter
    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public int getDetik() {
        return detik;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }

    // Method untuk menghitung lama waktu dalam detik
    public int totalDetik() {
        return jam * 3600 + menit * 60 + detik;
    }

    // Method untuk menghitung selisih waktu
    public static Waktu hitungLamaWaktu(Waktu awal, Waktu akhir) {
        int totalAwal = awal.totalDetik();
        int totalAkhir = akhir.totalDetik();

        int selisihDetik = Math.abs(totalAkhir - totalAwal);
        int jam = selisihDetik / 3600;
        int menit = (selisihDetik % 3600) / 60;
        int detik = selisihDetik % 60;

        return new Waktu(jam, menit, detik);
    }

    @Override
    public String toString() {
        return jam + " jam, " + menit + " menit, " + detik + " detik";
    }

    // Main method untuk pengujian mandiri
    public static void main(String[] args) {
        Waktu waktuAwal = new Waktu(10, 15, 30);
        Waktu waktuAkhir = new Waktu(12, 45, 15);

        System.out.println("Waktu Awal: " + waktuAwal);
        System.out.println("Waktu Akhir: " + waktuAkhir);
        System.out.println("Lama Waktu: " + Waktu.hitungLamaWaktu(waktuAwal, waktuAkhir));
    }
}

