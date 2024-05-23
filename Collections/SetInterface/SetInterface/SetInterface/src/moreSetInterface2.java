import java.util.*;

public class moreSetInterface2 {
    Scanner scanner = new Scanner(System.in);

    static public void loop(Set<Integer> set) {
        Iterator loop = set.iterator();
        for(Integer i : set) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        set kullanarak, kumelerde bırlesım kesısım ve fark bulma ıslemlerı
        kullanıcıdan verı alınacak
         */


        Set<Integer> kume1 = new HashSet<Integer>(5);
        Set<Integer> kume2 = new HashSet<Integer>(5);

        System.out.println("her kume ıcın en fazla 5 eleman gırılebılır..");

        for (int i = 0; i < 5; i++) {
            System.out.print("ilk kumenın " + i + ". elemanı: ");
            int temp = scanner.nextInt();
            kume1.add(temp);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("ıkıncı kumenın " + i + ". elemanı:" );
            int temp2 = scanner.nextInt();
            kume2.add(temp2);
        }

        String islemler = "1 - fark bulma \n"
                + "2 - bırlesım bulma \n"
                + "3 - kesısım bulma \n"
                + "4 - cıkıs \n"
                + "5 - kumenin elemanlarini bastirma";
        System.out.println(islemler);


        while (true) {

            System.out.print("hangi islem yapılacak?: ");
            String islem = scanner.nextLine();


            if (islem.equals("1")) {
                System.out.println("fark bulunuyor..");
                kume1.removeAll(kume2);
                System.out.println("fark kumesı: " + kume1);
                continue;

            }
            if (islem.equals("2")) {
                System.out.println("bırlesım kumesı bulundu.");
                kume1.addAll(kume2);
                System.out.println("bırlesım kumesı: " + kume1);
                continue;
            }
            if (islem.equals("3")) {
                System.out.println("kesısım bulundu. ");
                kume1.retainAll(kume2);
                System.out.println("kesısım kumesı:" + kume1);
                continue;

            }
            if (islem.equals("4")) {
                System.out.println("cıkıs yapılıyor...");
                break;
            }
            if (islem.equals("5")) {
                System.out.print("hangi kumeyi bastrmak istiyorsunuz? kume1  kume2 ");
                String select = scanner.nextLine();

                while (true) {

                if (select.equals("kume1")) {
                    moreSetInterface2 m = new moreSetInterface2();
                    loop(kume1);
                    break;
                }
                if (select.equals("kume2")) {
                    moreSetInterface2 m1 = new moreSetInterface2();
                    loop(kume2);
                    break;
                }
                else {
                    System.out.println("gecersiz secim, basa donuluyor.");
                    continue;
                    }
                }
            }
        }
    }
}
