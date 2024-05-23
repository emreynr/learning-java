public class JaggedArray {
    public static void main(String[] args) {
        // bır oncekı 2d dizilerde kare matrıs seklınde olusuturuyorduk
        //Jagged matrisler ise 2x5, 4x3 gibi sımetrık olmayan matrıslere ızın verır


        // 3 satırlı satırlı matrıs olusumu
        int[][] jagged = new int[3][];

        jagged[0] = new int [3]; // ilk satırın 3 elemanı olucak. eleman atamıyoruz, adet belırtıyoruz
        jagged[1] = new int[2];  // ikinci satırın 2 elemanı olucak
        jagged[2] = new int[5];  // 5 elemanlı ikinci satır

        int count = 0;
        for(int i = 0; i < jagged.length; i++) {
            for(int j = 0; j < jagged[i].length; j++) {
                // count = count + 1;
                jagged[i][j] = count++;
            }
        }

        System.out.println("contents of the 2d jagged array..");
        for(int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println(" ");  // bir alt satıra gecmek ıcın
        }
    }
}
