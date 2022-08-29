import java.util.Scanner;
public class CiftSayilariBulma {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;

    System.out.print("Bir Sayı Giriniz: ");
    n = input.nextInt();

    for(int i=0; i<=n; i++){
        if(i%2==0)
        System.out.println("Çift Sayı = " + i);

    }
        
    }
    
}
