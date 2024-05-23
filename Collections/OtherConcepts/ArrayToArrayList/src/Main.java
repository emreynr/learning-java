import java.util.ArrayList;

public class Main {

    public static void function(int array[]) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //elementlerı .add() ıle for kullanarak ekleyecegız
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        System.out.println("here are arraylist elements : " + arrayList);

    }

    public static void main(String[] args) {

        /*
        Array ilkel veri turlerinden veya nesnelerden olabılen ogelerın koleksıyonudur.
        javadakı Arrayler yapısı geregı static yapılardır. ArrayList ise ogelerı sadece
        nesne olarak saklayabılır. javdakı ArrayListler Arraylerden farklı olarak yapısı geregı dinamiktir.
        yanı; Arraylerin boyutu sabittir ve eleman ekleme cıkarma yapılamaz, sabittir.
        ArrayListler dinamiktir ve eleman ekleme cıkarma ıslemı yapılabılır, uzerınde ıslemler yapılabılır.

        Array to ArrayList icin bırkac farklı yontem vardır.
        1 - ArrayListe Array ogelerını manuel olarak eklemek ıcın ArrayList.add() yontemı kullanılır.

         */
        // yukarıdakı yontem ıle ekleme
        // tabı once class altında bunu metodunu yazacagız

        // ArrayListe eklemek ıcın Array olusuturalım
        int array[] = { 1,2,3,4,43,43,42,2};
        function(array);

    }
}