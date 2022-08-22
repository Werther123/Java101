import java.util.Scanner;
public class VucutKitleEndeksi {
    

public static void main(String[] args) {

    double boy;
    double kilo;
    double vucutIndex;
    Scanner input = new Scanner(System.in);

    System.out.print("Boy Giriniz(Metre Cinsinden) = ");
    boy = input.nextDouble();
    System.out.print("Kilo Giriniz = ");
    kilo = input.nextDouble();

    vucutIndex = (kilo / boy) ;
    System.out.println("Vücut Kitle Endeksi = " + vucutIndex);


}

    
}
