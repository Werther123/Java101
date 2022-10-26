public class DiziElemanlariMaksMin {
    public static void main(String[] args) {

        int[] list = {4,1,3,72,19,26};
        int max=list[0];
        int min=list[0];
        
        for(int i=0; i<list.length; i++){
            if(list[i]> max){
                max = list[i];
            }
            if(list[i]< min){
                min = list[i];
            }
        }
        System.out.println("Listenin En Büyük Sayısı: " + max);
        System.out.println("Listenin En Küçük Sayısı: " + min);
    }
    
}
