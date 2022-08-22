import java.util.Scanner;
public class DaireAlan {

    public static void main(String[] args) {

        int yaricap,aci;
        Scanner input = new Scanner(System.in);
        double pi=3.14,alan;

        System.out.print("Daire yarıçap = ");
        yaricap = input.nextInt();
        System.out.print("Merkez Açı = ");
        aci = input.nextInt();
        
        alan = (pi*(yaricap*yaricap)*aci) / 360;
        System.out.println("Dairenin Alanı = " + alan);

    }

    
}
