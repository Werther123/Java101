import java.util.Scanner;
public class Taksimetre {

    public static void main(String[] args) {

        double km = 2.20,toplamUcret;
        int mesafe;
        Scanner input = new Scanner(System.in);
        System.out.print("Yolculuk mesafesi giriniz : ");
        mesafe = input.nextInt();

         if(mesafe<4) {
            System.out.println("Odenecek Tutar = 20TL");
         }
         else{

            toplamUcret = 10 + (mesafe*km);
            System.out.println("Odenecek Tutar = " + toplamUcret);

         }
    }
    
}
