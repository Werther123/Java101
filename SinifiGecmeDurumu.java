import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, toplam = 0, sayac = 0;
        double avarage;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();
        if ((mat < 100) && (mat > 0)) {
            toplam += mat;
            sayac++;
        } else {
            System.out.println("Girilen not ortalamaya katilmayacak");
        }

        System.out.print("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();
        if ((fizik < 100) && (fizik > 0)) {
            toplam += fizik;
            sayac++;
        } else {
            System.out.println("Girilen not ortalamaya katilmayacak");
        }

        System.out.print("Turkce notunuzu giriniz:");
        turkce = inp.nextInt();
        if ((turkce < 100) && (turkce > 0)) {
            toplam += turkce;
            sayac++;
        } else {
            System.out.println("Girilen not ortalamaya katilmayacak");
        }

        System.out.print("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();
        if ((kimya < 100) && (kimya > 0)) {
            toplam += kimya;
            sayac++;
        } else {
            System.out.println("Girilen not ortalamaya katilmayacak");
        }

        System.out.print("Muzik notunuzu giriniz:");
        muzik = inp.nextInt();
        if ((muzik < 100) && (muzik > 0)) {
            toplam += muzik;
            sayac++;
        } else {
            System.out.println("Girilen not ortalamaya katilmayacak");
        }

        avarage =toplam/sayac;

        System.out.println("Ortalamaniz:" + avarage);

        if (avarage <= 55) {
            System.out.println("Sinifta kaldiniz.\nSeneye gorusuruz:)");
        } else {
            System.out.println("Sinifi gectiniz.\nTebrikler!");
        }

    }
    
}
