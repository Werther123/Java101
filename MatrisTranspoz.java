public class MatrisTranspoz {

    public static void main(String[] args) {

        int[][] dizi = { {1, 2, 3}, {4, 5, 6} };
        int transpoz[][] = new int [dizi[0].length][dizi.length];

        for(int i = 0; i < dizi[0].length; i++){
            for(int j=0; j < dizi.length; j++){
                transpoz[i][j] = dizi[j][i];

            }
        }
        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[i].length; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
