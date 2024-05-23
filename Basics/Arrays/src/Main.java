import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array;
        array = new int[12]; // nesne tabanlı dizi tanımlama
        // dizinin kac elemanlı olacagını belırmek ZORUDAYIZ

        int[] array1 = {1,2,3,43,54,35,643,5,345,253};
        //iki farklı sekılde de tanımlanabılır

        array[1] = 12;  // 1. indexe 12 yi ekle
        array1[3] = 3; // 3. indexteki elemanı artık 3 yapar

        // System.out.println(Arrays.toString(array1));
        // diziler ekrana bastırılırken bu sekılde string degere cevirilmelidir


        for (int s : array1) {
            // System.out.println("value: " + s);
        }

        int[][] arraytwoD = new int[3][12];
        // iki boyutlu bir dizi tanımlaması

        int[][] array2d = {{1,2,3}, {32,4,5}, {2,3,4}};
        // 2 boyutlu dizi icin degerleri onceden de belirtebiliriz


        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(array2d[row][col] + " ");
            }
            System.out.println(" ");
        }


    }
}