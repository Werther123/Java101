import java.util.Scanner;
public class BasamakSayiToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,tempNumber,total = 0;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        while(number != 0)
        {
           tempNumber = number % 10;
           System.out.println(tempNumber);
           number = number / 10;
           total = total + tempNumber;
       }
       System.out.println("Toplam = " + total);
    
        
        
    }
}
