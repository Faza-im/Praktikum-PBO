package prak6;

class BEM extends Mahasiswa {
    private String jabatan;

    public BEM(String nama, String nim, String jabatan) {
        super(nama, nim);
        this.jabatan = jabatan;
    }

    public void infoBEM() {
        System.out.println("Anggota BEM: " + super.nama + " (NIM: " + super.nim + ")");
        System.out.println("Jabatan: " + jabatan);
    }

    public void rapat() {
        System.out.println(jabatan + " " + super.nama + " sedang rapat.");
    }
}
