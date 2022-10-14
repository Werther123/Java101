import java.util.Scanner;

public class DeseneGoreMetot {

    static int method(int n, int temp){
        if(n==0 || n<=0){
            System.out.println(n);
            for(int i=0; i<=temp; i+=5){
                n+=5;
                if(n==temp){
                   return temp;
                 }
                System.out.println(n);
            
            }
            return n;
        }
        else {
        System.out.println(n);
        return method(n-5,temp);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Bir Sayı Giriniz: ");
        n = input.nextInt();
        System.out.println(method(n,n));
    
    
}
}