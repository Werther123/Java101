import java.util.Scanner;
public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,fact=1;
        System.out.print("Bir Sayı Giriniz = ");
        n = input.nextInt();

        for(int i=1; i<n; i++){
            fact*=i;
        }
        System.out.print("Sonuç = " + fact);
        
    }
    
}
