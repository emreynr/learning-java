import java.lang.reflect.Array;
import java.util.Arrays;

public class ReflectionArrays {

    public static void main(String[] args) {
        // sozdızımı su sekıldedır: X[] arrayOfXType = (X[]) Array.newInstance(X.class, size);

        // java dizilerini dinamik olarak olusturur ve bunlara statik olarak erısır
        // son sınıf oldugu ıcın somutlastırılamaz veya degistirilemez.
        // sınıf adının yontemlerı yalnızca bu sinif adının kendısı tarafından kullanılır


        // 6 elemenlı bir dizi olusturma
        int sizeOfArray = 6;

        // reflection Array tanımlanması
        // integer bir dizi olustur
        // reflect.Array sınıfını kullan
        int[] intArray = (int[]) Array.newInstance(int.class, sizeOfArray);

        //reflection array eleman ekleme
        Array.setInt(intArray, 4, 55);

        System.out.println(Arrays.toString(intArray));
        System.out.println("element at ındex: 4  "  + Array.getInt(intArray, 4));



    }
}
