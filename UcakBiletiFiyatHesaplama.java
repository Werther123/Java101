import java.util.Scanner;
public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yas,mesafe,yolculukTipi;
        double tutar,yasİndirim,indirimTutar,mesafeİndirim,sonTutar;

        System.out.print("Müşterinin Yaşını Giriniz = ");
        yas = input.nextInt();
        System.out.print("Yolculuk Mesafini Giriniz(Km) = ");
        mesafe = input.nextInt();
        System.out.println("Yolculuk Tipini Giriniz(\n1-Tek Yön\n2-Gidiş-Dönüş) = ");
        yolculukTipi = input.nextInt();


        if(mesafe>0){
            if(yas>0){
                if(yolculukTipi==1 || yolculukTipi==2) {
            if(yas<12){
                    tutar = (mesafe * 0.10);
                    System.out.println("Normal Tutar = " + tutar );
                    yasİndirim = (tutar * 50)/100;
                    System.out.println("Yaş İndirimi = " + yasİndirim);
                    indirimTutar = tutar - yasİndirim;
                    System.out.println("İndirimli Tutar = " + indirimTutar);
                        if(yolculukTipi==2) {
                        mesafeİndirim = (indirimTutar * 20)/100;
                        System.out.println("Gidiş-Dönüş Bilet İndirimi = " + mesafeİndirim);
                        sonTutar = (indirimTutar - mesafeİndirim)*2;
                        System.out.println("Toplam tutar = " + sonTutar );
                }
                        if(yolculukTipi==1){
                        System.out.println("Toplam tutar = " + indirimTutar);

                    }
                }   
            if(yas>=12 && yas<=24){
                tutar = (mesafe * 0.10);
                System.out.println("Normal Tutar = " + tutar );
                yasİndirim = (tutar * 10)/100;
                System.out.println("Yaş İndirimi = " + yasİndirim);
                indirimTutar = tutar - yasİndirim;
                System.out.println("İndirimli Tutar = " + indirimTutar);
                    if(yolculukTipi==2) {
                    mesafeİndirim = (indirimTutar * 20)/100;
                    System.out.println("Gidiş-Dönüş Bilet İndirimi = " + mesafeİndirim);
                    sonTutar = (indirimTutar - mesafeİndirim)*2;
                    System.out.println("Toplam tutar = " + sonTutar );
            }
                    if(yolculukTipi==1){
                    System.out.println("Toplam tutar = " + indirimTutar);

                }
            }
            
            if(yas>24 && yas<65){
                    if(yolculukTipi==2) {
                    tutar = (mesafe * 0.10);
                    System.out.println("Normal Tutar = " + tutar );
                    mesafeİndirim = (tutar * 20)/100;
                    System.out.println("Gidiş-Dönüş Bilet İndirimi = " + mesafeİndirim);
                    sonTutar = (tutar - mesafeİndirim)*2;
                    System.out.println("Toplam tutar = " + sonTutar );
            }
                    if(yolculukTipi==1){
                    tutar = (mesafe * 0.10);
                    System.out.println("Normal Tutar = " + tutar);
            

                }
            }
           
            
            if(yas>65){
                    tutar = (mesafe * 0.10);
                    System.out.println("Normal Tutar = " + tutar );
                    yasİndirim = (tutar * 30)/100;
                    System.out.println("Yaş İndirimi = " + yasİndirim);
                    indirimTutar = tutar - yasİndirim;
                    System.out.println("İndirimli Tutar = " + indirimTutar);
                        if(yolculukTipi==2) {
                        mesafeİndirim = (indirimTutar * 20)/100;
                        System.out.println("Gidiş-Dönüş Bilet İndirimi = " + mesafeİndirim);
                        sonTutar = (indirimTutar - mesafeİndirim)*2;
                        System.out.println("Toplam tutar = " + sonTutar );
                }
                        if(yolculukTipi==1){
                        System.out.println("Toplam tutar = " + indirimTutar);

                    }
                }

            


        }
        else
            System.out.println("Hatalı Veri Girdiniz");
        
    }
    else
        System.out.println("Hatalı Veri Girdiniz");
    
        
    }
    else
        System.out.println("Hatalı Veri Girdiniz");
    
}
}
    

