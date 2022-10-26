import java.util.Arrays;

public class DiziTekrarEdenSayi {

    static boolean isFind(int[] arr, int value){
        for(int i: arr){
           if(i==value){
            return true;
           }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {2,4,2,4,5,7,8,9,8,12,14,13,13,19,21};
        int[] duplicate = new int[list.length];
        int index=0;

        for(int i=0; i<list.length; i++){
            for(int j=0; j<list.length; j++){
                if((i!=j) && (list[i]==list[j])){
                    if(list[i]%2==0){
                    if(!isFind(duplicate, list[i]))
                    duplicate[index++] = list[i];
                    break;
                }
            }
            }
        }
        System.out.print("[");
        for(int i : duplicate){
            if(i!=0)
            System.out.print(i + ",");
        }
        System.out.print("]");
        
    }
    
}
