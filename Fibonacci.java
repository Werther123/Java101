import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen eleman sayısını giriniz : ");

        int sayi = scan.nextInt();
        int number1 = 0,number2 = 1,result;
        System.out.print(number1 +" " +number2 + " ");
        for(int i = 1;i <= (sayi - 2);i++){
            result = number1 + number2;
            System.out.print(result + " ");
            number1 = number2;
            number2 = result;
        }

    }
}