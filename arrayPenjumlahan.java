public class arrayPenjumlahan {
    
    public static void main(String[] args) {
        int[][] matriksA = {{4,2},{3,1}};
        int[][] matriksB = {{1,1},{1,1}};
        
        for (int baris = 0; baris < matriksA.length; baris++){
            for (int kolom = 0; kolom < matriksB[0].length; kolom++){
                System.out.print((matriksA[baris][kolom] + matriksB[baris][kolom])+ "\t");
            }
            System.out.println(" ");
        }
    }
}
