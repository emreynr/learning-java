public class Main {
    public static void main(String[] args) throws Exception {

        // Stringnlerden olusan bır dızı olusturuyoruz
        String info[] =  {"david", "sarah", "michael", "test"};

        for (int i = 0; i < info.length; i++) {
            // her bir islem arası 3 sanıye beklesın
            Thread.sleep(3000);
            System.out.println(info[i]);
        }
    }
}