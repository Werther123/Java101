import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password,select,newPassword;

        System.out.print("Kullanıcı adı giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifre giriniz : ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("dev")) 
        {
            System.out.println("Başarılı bir şekilde giriş yaptınız");
        }
            else
            {
                System.out.println("Şifre sıfırlamak istiyor musunuz ?");
                select = input.nextLine();

                if(select.equals("evet")){
                    System.out.print("Yeni şifrenizi giriniz (Eski şifrenizle aynı olamaz ve Hatalı şifreylede aynı olamaz) = ");
                    newPassword = input.nextLine();

                    if(newPassword.equals(password))
                        System.out.println("Şifre Oluşturulamadı");
                        
                   
                else 
                System.out.println("Şifre oluşturuldu");
            
                }
                else
                System.out.print("Sağlıcakla Kalın");

            }
        
        
    }
    
}
