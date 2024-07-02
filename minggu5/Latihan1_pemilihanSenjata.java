import java.util.Scanner;

public class Latihan1_pemilihanSenjata {

    public static void main(String[] args) {
        Scanner sc21 = new Scanner(System.in);

        System.out.print("Masukkan jarak : ");
        int jarak = sc21.nextInt();

        if (jarak<=5){
            System.out.println("silahkan gunakan Melee Weapon");
        }
        
        else {
            System.out.println("silahkan gunakan Ranged Weapon");

        }
        
    
    }
}