import java.util.Scanner;

public class Latihan2_Login {
  
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Username dan password yang tersimpan di Sistem
    String username = "admin1" ;
    String password = "password1" ;

    //Input pengguna
    System.out.print("Masukkan username: ");
    String inputUsername = input.nextLine();
    System.out.print("Masukkan password: ");
    String inputPassword = input.nextLine();


    //Memeriksa Username and Password cocok

    if (inputUsername.equals(username) && inputPassword.equals(password))
    {System.out.println("Login berhasil. Selamat datang  " + inputUsername + "!!!" ); 
    
    }else {
    System.out.println("Username dan/atau password salah. Silakan coba lagi.");
    }
    
}
}


