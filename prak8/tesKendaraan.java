package prak8;

public class testKendaraan {
    public String merk;
    public int tangki;
    public long harga;
    public String tipe;
    public String warna;

    public testKendaraan(String merk, int tangki, long harga, String tipe, String warna){
        this.merk = merk;
        this.tangki = tangki;
        this.harga = harga;
        this.tipe = tipe;
        this.warna = warna;
    }

    public void tampilInfo(){
        System.out.println("Informasi Kendaraan");
        System.out.println("Merk:" +merk);
        System.out.println("Tipe: " +tipe);
        System.out.println("Warna: " +warna);
        System.out.println("Kapasitas tangki: " +tangki+ " Liter");
        System.out.println("Harga: Rp " +harga);
        System.out.println();
    }

    public static void main(String[] args){
        testKendaraan kendaraan1 = new testKendaraan("N max", 20, 30000000, "Matic", "Hitam");

        kendaraan1.tampilInfo();

        System.out.println("Tes selesai. Anda akan kembali ke menu sebelumnya.\n");
    } 
}
