import java.util.Scanner;
public class UsluSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k;
        double total =1;
        System.out.print("Üssü Alınacak Sayı = ");
        n = input.nextInt();
        System.out.print("Üs Olacak Sayı = ");
        k = input.nextInt();

        for(int i=1; i<=k; i++ ){

            total*=n;
        }
        
        System.out.println("Sonuç" + total);

        

        
    }
    
}
