import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int number;

        System.out.print("Bir Sayi Giriniz = ");
        number = input.nextInt();

        for(double i=1; i<=number; i++){
            total = (total + 1/i);
        
        }
        System.out.println("Harmonik Seri Toplamı  = " + total);

    }
    
}
