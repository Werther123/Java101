public class DiziElemanFrekans {
  
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 1, 3,4,5,6,7,7,7,8,8};
        int[] tekrarlar = new int[dizi.length]; // tekrar sayılarını saklayacağımız bir dizi

        // Dizideki elemanların tekrar sayısını hesapla
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    tekrarlar[i]++;
                    tekrarlar[j]++;
                }
            }
        }

        // Sonuçları ekrana yazdır
        for (int i = 0; i < dizi.length; i++) {
            if (tekrarlar[i] > 0) {
                System.out.println(dizi[i] + " sayısı " + (tekrarlar[i] + 1 + " kez tekrar edildi "));
            }
            else{
                System.out.println(dizi[i] + " sayısı tekrar edilmedi ");
            }
        }
    }
    
}