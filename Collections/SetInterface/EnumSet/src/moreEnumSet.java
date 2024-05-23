
import java.util.EnumSet;
import java.util.Iterator;

public class moreEnumSet {

    enum GamesPlatform {PS4, PC, XBOX}

    public static void main(String[] args) {

        // alloff ile EnumSet objesi olusturma
        EnumSet<GamesPlatform> gamesPlatforms = EnumSet.allOf(GamesPlatform.class);

        // cikti olarak yukaridaki GamesPlatform icindeki elementleri bastirir
        System.out.println("EnumSet is here: " + gamesPlatforms);

        // ikinci bir EnumSet ekleme, noneoff ile
        EnumSet<GamesPlatform> gamesPlatforms2 =  EnumSet.noneOf(GamesPlatform.class);

        // Ilk enumSet uzerinden bir element alip yeni olusturdugumz enumSet icine kopyaladik
        gamesPlatforms2.add(GamesPlatform.PC);

        System.out.println("enumset using add key" + gamesPlatforms2);

        //ilk enumdaki tum elemanlari ikinci enuma ekleme
        gamesPlatforms2.addAll(gamesPlatforms);

        System.out.println("enumset using addall key: "  + gamesPlatforms2);

        //iterator ile yineleme
        Iterator<GamesPlatform> iterator = gamesPlatforms.iterator();

        for (Object o : gamesPlatforms) {
            System.out.println(o);
        }

        //remove ile eleman silme
        boolean element  = gamesPlatforms.remove(GamesPlatform.PS4); // ps4 u siliyoruz

        System.out.println("is element removed? " + element);
        System.out.println("updated list: " + gamesPlatforms);












        
    }
}
