// SOAL 2

import java.util.Scanner;

public class InputBintang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bintang yang ingin ditampilkan: ");
        int jumlahBintang = input.nextInt();

        for (int i = 0; i < jumlahBintang; i++) {
            System.out.print("*");
        }

        System.out.println(); // Untuk mengakhiri baris setelah menampilkan bintang
    }
};

        
    //     public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
        
    //     int batas;
    //     System.out.println("Masukkan batas: ");
    //     batas = input.nextInt();



    //     for( int x = 0; x <=batas; x++)
    // {
    //     System.out.println( " * " + kelipatan + "*");


    // }
    }
}
