package prak4;

public class Main {
    public static void main(String[] args) {
        // Instansiasi objek Segitiga
        Segitiga segitiga = new Segitiga();

        // Mengatur nilai alas dan tinggi
        segitiga.setAlas(8);
        segitiga.setTinggi(6);

        // Mendapatkan dan mencetak nilai alas, tinggi, dan luas segitiga
        System.out.println("Alas Segitiga: " + segitiga.getAlas());
        System.out.println("Tinggi Segitiga: " + segitiga.getTinggi());

        double luas = segitiga.getLuas();
        System.out.println("Luas Segitiga: " + luas);
    }
}
