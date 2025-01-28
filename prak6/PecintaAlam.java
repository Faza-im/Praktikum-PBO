package prak6;

class PecintaAlam extends Mahasiswa {
    public PecintaAlam(String nama, String nim) {
        super(nama, nim);
    }

    public void aktivitas() {
        System.out.println(super.nama + " adalah seorang pecinta alam.");
    }
}
