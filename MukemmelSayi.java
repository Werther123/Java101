import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,total=0;

        System.out.print("Bir Sayı Giriniz: ");
        number = input.nextInt();

        for(int i=1; i<number; i++){
            if(number%i == 0){
                total +=i;    
            }
        }
        System.out.println("Bölenlerin Toplamı: " +total);
        if(total==number){
                System.out.println("Mükemmel Sayıdır");
        }
        else
        System.out.println("Mükemmel Sayı Değildir");
        
        
    }
}
