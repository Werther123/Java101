import java.util.Scanner;
public class KuvvetleriBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Bir Sayı Giriniz = ");
        n = input.nextInt();

        for(int i=1; i<n; i=i*4){
            System.out.println("Dördün Kuvvetleri = " + i);
            }
            for(int i=1; i<n; i*=5){
                System.out.println("Beşin Kuvvetleri = " + i);
            }

        }
        
    }
