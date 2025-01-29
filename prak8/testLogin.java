package prak8;

import java.util.Scanner;
public class testLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dataLogin login = new dataLogin();
        boolean isRunning = true;

        while (isRunning){
            System.out.println("MENU UTAMA:");
            System.out.println("-------------");
            System.err.println("Menu Pilihan:");
            System.out.println("A. Login");
            System.out.println("B. Exit");
            System.out.print("Pilihan anda: ");
            String pilihan = scanner.nextLine().toUpperCase();

            switch (pilihan){
                case "A":
                System.out.print("Masukkan Username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan Password: ");
                String password = scanner.nextLine();

                if (!login.validasi(username, password)){
                    System.out.println("Username dan password tidak boleh kosong");
                } else if (login.cekData(username, password)){
                    boolean isLoggedIn = true;
                    while (isLoggedIn){
                        System.out.println("\nSelamat datang " +username);
                        System.out.println("===================");
                        System.out.println("MENU PILIHAN");
                        System.out.println("-----------------");
                        System.out.println("1. Tes Kendaraan");
                        System.out.println("2. Log Off");
                        System.out.print("Pilihan anda: ");
                        String subPilihan = scanner.nextLine();

                        switch (subPilihan){
                            case "1":
                            System.out.println("\nMenjalankan Tes Kendaraan...");
                            testKendaraan.main(null);
                            break;

                            case "2":
                            System.out.println("Anda telah log off.\n");
                            isLoggedIn = false;
                            break;

                            default:
                            System.out.println("Pilihan tidak valid.");
                            break;
                        }

                    }
                } else {
                    System.out.println("Login gagal! Username atau password salah");
                }
                break;

                case "B":
                System.out.println("Terimakasih telah menggunakan program ini");
                isRunning = false;
                break;

                default: 
                System.out.println("Pilihan tidak valid. Silahkan masukkan input yang valid");
                break;
            }
            System.out.println();
        }
        scanner.close();


    }
    
}
