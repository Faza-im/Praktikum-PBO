package prak6;

public class Main {
    public static void main(String[] args){
        BEM ketuaBEM = new BEM("Alpin Huda", "1234567", "Ketua Umum");
        ketuaBEM.infoMahasiswa();
        ketuaBEM.infoBEM();
        ketuaBEM.rapat();
        
        System.out.println();
        
        PecintaAlam pecintaAlam = new PecintaAlam("hanif syabandi", "8765543");
        pecintaAlam.infoMahasiswa();
        pecintaAlam.aktivitas();
    }
}
