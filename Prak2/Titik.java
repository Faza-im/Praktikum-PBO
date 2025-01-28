package Prak2;

public class Titik {
    private double absis;
    private double ordinat;

    // Constructor
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    // Getter and Setter
    public double getAbsis() {
        return absis;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    // Method untuk menghitung jarak dua titik
    public double hitungJarak(Titik titikLain) {
        return Math.sqrt(Math.pow(this.absis - titikLain.absis, 2) + Math.pow(this.ordinat - titikLain.ordinat, 2));
    }

    // Method untuk menentukan titik tengah dua titik
    public Titik titikTengah(Titik titikLain) {
        double tengahX = (this.absis + titikLain.absis) / 2;
        double tengahY = (this.ordinat + titikLain.ordinat) / 2;
        return new Titik(tengahX, tengahY);
    }

    @Override
    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }

    // Main method untuk pengujian mandiri
    public static void main(String[] args) {
        Titik titik1 = new Titik(3, 4);
        Titik titik2 = new Titik(7, 1);

        System.out.println("Titik 1: " + titik1);
        System.out.println("Titik 2: " + titik2);
        System.out.println("Jarak antara titik 1 dan titik 2: " + titik1.hitungJarak(titik2));
        System.out.println("Titik tengah antara titik 1 dan titik 2: " + titik1.titikTengah(titik2));
    }
}
