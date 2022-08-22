import java.util.Scanner;
public class DikUcgen {


   
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        int a,b,c;
        double  ucgenAlani,ucgenCevre,d,hipo;

        System.out.print("Kenar uzunlugu giriniz : ");
        a = input.nextInt();
        System.out.print("Kenar uzunlugu giriniz : ");
        b = input.nextInt();
        System.out.print("Kenar uzunlugu giriniz : ");
        c = input.nextInt();
        
    
        ucgenCevre = a + b + c;
        System.out.println("Ucgenin Cevre Uzunlugu = " + ucgenCevre);
        d = ucgenCevre / 2;
        ucgenAlani = Math.sqrt(d*(d-a)*(d-b)*(d-c));
        System.out.println("Ucgenin Alani = " + ucgenAlani);

    

    }
    
}
