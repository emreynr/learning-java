import java.util.Arrays;

public class sumOn2dArrays {
    public static void main(String[] args) {
        //2d diziler uzerındekı elemanlarda toplama

        int[][] array1 = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {12, 3, 44, 2}
        };

        int[][] array2 = {
                {43, 4, 33, 22},
                {32, 44, 55, 66},
                {4, 34, 33, 11}
        };

        int[][] sum = new int[3][4];
        // iki farklı dizideki elemanların toplamını farklı bır diziye toplam olarak ekleme

        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2.length; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }



        for (int i = 0; i < sum.length; i++) {
            System.out.println(Arrays.toString(sum[i]));
            // toplamlarını baska bir diziye atayıp bastırmıs olduk
        }
    }
}

