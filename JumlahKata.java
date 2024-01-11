import java.util.Scanner;

public class JumlahKata {
    
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);

     System.out.print("Masukkan jumlah kata: ");
         int jumlahKata = input.nextInt();
         String TempatAsal[] = new String[jumlahKata];
         for (int i = 0; i < jumlahKata; i++) {
             System.out.print("Kata ke-" + (i + 1) + ": ");
             String kata = input.next();
             TempatAsal[i][0] = kata;
         }
         System.out.println("Kata yang diinput:");
         for (int i = 0; i < jumlahKata; i++) {
             System.out.println(TempatAsal[i][0]);

         }
    }
}