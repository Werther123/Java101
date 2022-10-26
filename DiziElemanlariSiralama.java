import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanlariSiralama {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int n,a;
        System.out.print("Dizinin Boyutunu Giriniz: ");
        n = input.nextInt(); 
        int[] list = new int[n];

        System.out.println("Dizinin Elemanlarını Giriniz: ");
        for(int i=0; i<list.length; i++){
            System.out.print(i+1 + ". Elemanı: ");
            a = input.nextInt();
            list[i] = a;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
    
}
