public class stringIndexOutOfBound {

    public static void main(String[] args) {


        try {
            String s = "god damn it";
            char a = s.charAt(22);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("index not found...");
        }
    }
}
