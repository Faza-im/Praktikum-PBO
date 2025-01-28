package prak3;

public class Mahasiswa {
    // Atribut private
    private String nama;
    private String nim;
    private String alamat;
    private int umur;
    private String jurusan;

    // Konstruktor default
    public Mahasiswa() {
        this.nama = "Tidak diketahui";
        this.nim = "Tidak diketahui";
        this.alamat = "Tidak diketahui";
        this.umur = 0;
        this.jurusan = "Tidak diketahui";
    }

    // Konstruktor dengan 2 parameter
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Konstruktor dengan 3 parameter
    public Mahasiswa(String nama, String nim, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
    }

    // Konstruktor dengan 5 parameter
    public Mahasiswa(String nama, String nim, String alamat, int umur, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    // Method untuk mencetak informasi mahasiswa
    public void cetakInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Alamat: " + alamat);
        System.out.println("Umur: " + umur);
        System.out.println("Jurusan: " + jurusan);
    }

    public static void main(String[] args) {
        // Instansiasi objek menggunakan konstruktor default
        Mahasiswa mahasiswaDefault = new Mahasiswa();
        System.out.println("Informasi Mahasiswa (Constructor Default):");
        mahasiswaDefault.cetakInformasi();

        System.out.println();

        // Instansiasi objek menggunakan konstruktor berparameter
        Mahasiswa mahasiswaParam = new Mahasiswa("Faza Ilmal Mughni", "23533803", "Ponorogo", 20, "Teknik Informatika");
        System.out.println("Informasi Mahasiswa (Constructor Berparameter):");
        mahasiswaParam.cetakInformasi();
    }
}
