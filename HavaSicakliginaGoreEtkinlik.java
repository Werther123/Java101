import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double sicaklik;

        System.out.print("Sıcaklık Giriniz: ");
        sicaklik = input.nextDouble();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz");
        }
            else if(sicaklik>=5 && sicaklik<15)
            {
                System.out.println("Sinemaya gidebilirsiniz");
            }
                else if(sicaklik>=15 && sicaklik<25) 
                {
                    System.out.println("Piknik iyi gider");
                }
                else if(sicaklik>=25){
                    System.out.println("Yüzmek iyi gelir");
                }
        
    }
}
