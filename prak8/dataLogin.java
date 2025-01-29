package prak8;

public class dataLogin implements Login{
    private final String namaUser1 = "Faza";
    private final String pass1 = "1111";
    private final String namaUser2 = "Mughni";
    private final String pass2 = "2222";
    
    @Override
    public boolean validasi(String username, String password){
        return !(username==null || username.isEmpty() || password.isEmpty());
    }
    
    @Override
    public boolean cekData(String username, String password){
        return(username.equals(namaUser1)&& password.equals(pass1))||
                (username.equals(namaUser2)&& password.equals(pass2));
    }
}
