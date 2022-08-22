import java.util.Scanner;
public class KdvTutari {
    
    public static void main(String[] args ) {
        
        
        Scanner input = new Scanner(System.in);
        int tutar;
        double kdvOrani = 0.18;
        double kdvOrani1 = 0.18;
        double kdvFiyat;
        double kdvTutari;

        System.out.print("Tutar giriniz : ");
        tutar = input.nextInt();
        
        if(tutar <= 1000) {

            kdvFiyat = (tutar * kdvOrani) + tutar ;
            kdvTutari = kdvFiyat - tutar;
            System.out.println("KDV'li Fiyat =  " + kdvFiyat);
            System.out.println("KDV Fiyatı = " + kdvTutari);
        }
          else {

                kdvFiyat = (tutar * kdvOrani1) + tutar ;
                System.out.println("KDV'li Fiyat =" + kdvFiyat);
                kdvTutari = kdvFiyat - tutar;
                System.out.println("KDV Fiyatı = " + kdvTutari);
            }
        
    }
}
    
    
