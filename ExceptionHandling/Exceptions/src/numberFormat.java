public class numberFormat {

    public static void main(String[] args) {
        // sayi olmayan bir deger icin istisna dondurme

        try {
            int a = Integer.parseInt("tokki"); // tokki adlı degeri integere cevırmeyi denedil
        }
        catch (NumberFormatException e) {
            System.out.println("tokki does not a number format..");
        }
    }
}
