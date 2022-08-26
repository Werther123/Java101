import java.util.Scanner;
public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,select;

        System.out.print("İlk Sayıyı Giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        b = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz nedir? = ");
        select = input.nextInt();


        switch(select){
            case 1:
            { 
                System.out.println("Toplam = " + (a+b));
            
            }
            case 2:
            {
                System.out.println("Çıkarma = " + (a-b));
                break;
            }
            case 3:
            {
                System.out.println("Çarpma = " + (a*b));
                break;
            }
            case 4:
            {
                System.out.println("Bölme = " + (a/b));
                break;
            }

        }

        

    }
    
}
