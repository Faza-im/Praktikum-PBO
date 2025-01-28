package prak5;

public class Lingkaran extends Orang {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    public void getInfo() {
        System.out.println("Luas Lingkaran: " + hitungLuas());
    }
}
