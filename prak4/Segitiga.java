package prak4;

class Segitiga {
    // Atribut private
    private int alas;
    private int tinggi;
    private double luas;

    // Getter dan Setter untuk atribut alas
    public int getAlas() {
        return alas;
    }

    public void setAlas(int a) {
        if (a > 0) {
            this.alas = a;
        } else {
            this.alas = 0;
        }
    }

    // Getter dan Setter untuk atribut tinggi
    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int t) {
        if (t > 0) {
            this.tinggi = t;
        } else {
            this.tinggi = 0;
        }
    }

    // Method private untuk menghitung luas
    private void hitungLuas() {
        this.luas = 0.5 * this.alas * this.tinggi;
    }

    // Getter untuk atribut luas (dihitung secara otomatis)
    public double getLuas() {
        hitungLuas();
        return luas;
    }
}
