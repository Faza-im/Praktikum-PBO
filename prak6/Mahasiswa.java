package prak6;

class Mahasiswa {
    public String nama;
    public String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void infoMahasiswa() {
        System.out.println("Mahasiswa: " + nama + " (NIM: " + nim + ")");
    }
}
