package BoksOyunu;

public class Main {
        public static void main(String[] args) {
          Fighter marc = new Fighter("Marc" , 18 , 100, 90, 40);
          Fighter alex = new Fighter("Alex" , 20 , 95, 100, 35);
          Ring r = new Ring(marc,alex , 90 , 100);
          r.run();
        }
    
}
