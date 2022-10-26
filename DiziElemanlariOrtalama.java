public class DiziElemanlariOrtalama {
    public static void main(String[] args) {

         int[] list = {12,4,7,81,19,22};
         double average = 0.0;
         double sum=0.0;

         for(int i=0; i<list.length; i++){
            sum += list[i];
         }
            System.out.println("Liste Elemanlarının Toplamı: " + sum);
            average = sum / list.length;
            System.out.println("Liste Elemanlarının Ortalaması: " + average);
    }
    
}
