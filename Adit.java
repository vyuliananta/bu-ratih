public class adit {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas: ");
        int tinggi = input.nextInt();

        for (int i = tinggi; i >= 1; i--) {
            switch (i) {
                case 1:
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("**");
                    break;
                default:
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    break;
    }
    
    
}
