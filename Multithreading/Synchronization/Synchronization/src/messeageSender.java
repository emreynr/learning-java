public class messeageSender {

    public void send (String messeage) {

        System.out.println("sending: " + messeage);

        try {
            Thread.sleep(1500);
        }
        catch (Exception e) {
            System.out.println("sorry thread corrupted or interrupted");
        }
        System.out.println(messeage + "messeage Send.");
    }
}
