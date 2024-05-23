public class FinalArrays {

    public static void main(String[] args) {
        // final ile atanmıs dizilerde ekleme cıkarma yapılabılır ama o dizi ıcın kullanılan referans
        // asla baska bir dizi icin kullanılamaz

        final int[] finalArray = {1,2,5,6,4,435,3543,54};


        // finalArray[4] = 1; --> 4. indexi 1 olarak degistir

        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = finalArray[i] * 3;
            System.out.println(" result here: " + finalArray[i]);
        }

        System.out.println(" final atanmıs bir dizinin referansının baska bir nesneye atanama durumu");

        final int[] final1 = {1,2,3,5,6,7,43};
        final int[] final2 = {34,4,5,6,7,87,34,24};

        final1 = final2;
        final2 = final1;  // bu sekılde atama yapmaya ızın verılmedıgı ıcın hata alıyoruz

        for (int i = 0; i < final2.length; i++) {
            System.out.println(final2[i]);
        }
    }
}
