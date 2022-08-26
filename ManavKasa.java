import java.util.Scanner;
public class ManavKasa {
    
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float karpuz=0.42f,karpuzKg;
    int elma=3,elmaKg;
    double armut=4.2,armutKg,toplam;


    System.out.print("Kaç kilogram elma  = " );
    elmaKg = input.nextInt();
    System.out.print("Kaç kilogram armut = ");
    armutKg = input.nextDouble();
    System.out.print("Kaç kilogram karpuz = ");
    karpuzKg = input.nextFloat();

    toplam = (elma*elmaKg) + (armut*armutKg) + (karpuz*karpuzKg);
    System.out.println("Toplam tutar = " + toplam);
 
   
    


   }
}
