package prak9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class balokKayu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double panjang = 0, lebar = 0, tinggi = 0;
        boolean validInput = false;

        while (!validInput) {
            try{
                System.out.print("Masukkan panjang balok:");
                panjang = Double.parseDouble(input.nextLine());
                System.out.print("Masukkan lebar balok: ");
                lebar = Double.parseDouble(input.nextLine());
                System.out.print("Masukkan tinggi balok: ");
                tinggi = Double.parseDouble(input.nextLine());

                if(panjang <= lebar || lebar <= tinggi){
                    throw new IllegalArgumentException("Nilai haru memenuhi aturan: panjang > lebar > tinggi");
                }

                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka. Silahkan menginputkan data dengan benar");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok kayu: " +volume);

        try (BufferedWriter tulis = new BufferedWriter(new FileWriter("hasil_volume.txt"))) {
            tulis.write("Panjang: " +panjang+ "\n");
            tulis.write("Lebar: " +lebar+ "\n");
            tulis.write("Tinggi: " +tinggi+ "\n");
            tulis.write("Volume: " +volume+ "\n");
            System.out.println("Hasil perhitungan telah disimpan kedalam file 'hasil_volume.txt'.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan hasil ke file: " +e.getMessage());
        }
    }
    
}
