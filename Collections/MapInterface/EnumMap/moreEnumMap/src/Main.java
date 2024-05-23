import java.util.EnumMap;

public class Main {

    public  enum enumMapExamples {NAME1, NAME2, NAME3, NAME4}

    public static void main(String[] args) {

        // EnumMap olusturma
        EnumMap<enumMapExamples, String> enumMap = new EnumMap<enumMapExamples, String>(enumMapExamples.class);

        // element ekleme
        enumMap.put(enumMapExamples.NAME1, "david");
        enumMap.put(enumMapExamples.NAME2, "sarah");
        enumMap.put(enumMapExamples.NAME3, "mıchael");
        enumMap.put(enumMapExamples.NAME4, "jack");

        System.out.println("size of the EnumMap" + enumMap.size());
        System.out.println("EnumMap elements : " + enumMap);

        System.out.println("key : " + enumMapExamples.NAME1 + " value : " + enumMap.get(enumMapExamples.NAME1));

        System.out.println("++++++++++++++++++++++++++++++++++");
        // bır enummap uzerınden baska bır enumape ekleme yapma

        EnumMap<enumMapExamples, String> enumMap1 = new EnumMap<>(enumMapExamples.class);

        enumMap1.putAll(enumMap); // enumMap ıcındekı tum elementlerı enumMap1 ıcıne ekler
        enumMap1.put(enumMapExamples.NAME1, "testnamehere");
        System.out.println("updated enummap1 here : " + enumMap1);

        // elementlere erısme
        System.out.println("EnumMap key and values : " + enumMap1.entrySet());
        System.out.println("key : " + enumMap1.keySet());
        System.out.println("value : " + enumMap1.values());
        System.out.println("NAME2 adlı keye aıt deger : " + enumMap1.get(enumMapExamples.NAME2));
    }
}