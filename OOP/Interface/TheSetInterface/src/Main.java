import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // girilen cumle/kelimeler arasından farklı olanları yazdırma ( for each yapısı)

        Set<String> hashSet = new HashSet<String>();
        for (String s : args) {
            hashSet.add(s);
            // degerler uzerınde gezinecek ve bnları HashSet icerisine atacak
        }
        System.out.println(hashSet.size() + " distinct words found." + hashSet);


        // terminal ile calistiracagimiz icin veri almak icin args kullanacagız
    }
}