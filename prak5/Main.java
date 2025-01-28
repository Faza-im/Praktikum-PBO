package prak5;

public class Main {
    public static void main(String[] args){
        PersegiPanjang PPanjang = new PersegiPanjang(2, 9);
        Lingkaran bulat = new Lingkaran(9.5);

        System.out.println("Informasi Persegi Panjang:");
        PPanjang.getInfo();
        System.out.println();

        System.out.println("Informasi Lingkaran:");
        bulat.getInfo();
    }
}
