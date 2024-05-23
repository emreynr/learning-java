import java.util.HashSet;
import java.util.Set;

public class FindDupsAndUniqs {

    public static void main(String[] args) {

        Set<String> uniqs = new HashSet<String>(); //unique
        Set<String> dups = new HashSet<String>();  // dupplicates
        // girilen kelimelerde aynı ve farklı olanları ayrı ayrı bastıracagız

        for (String s1 : args) { // daha once de dedigimiz gibi hashset icine aynı degerden bir tane tutabılır
            if (!uniqs.add(s1)) {
                dups.add(s1);
                // burada add komutu ustune gelınce bir boolean dondurdugu goruluyor
                //eger fordan donen deger uniqs icine eklenmiyorsa, onu dups icine eklıyoruz.
            }
        }
        uniqs.removeAll(dups); // tekrarlayan kelimeleri sil

        System.out.println("uniqs values: " + uniqs); // uniq degerleri yazdırır
        System.out.println("duplicated values: " + dups);  // tekrarlayan degerleri yazdırır

    }
}
