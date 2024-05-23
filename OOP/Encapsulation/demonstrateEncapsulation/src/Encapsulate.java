public class Encapsulate {

    private String broName;
    private int broRoll;
    private int broAge;


    public int getBroAge() {     // get method for access to age
        return broAge;
    }
    public String getBroName() { // access and read to name
        return broName;
    }

    public int getBroRoll() { // accsess to broRoll
        return broRoll;
    }
    public void setBroName(String newName) {
        broName = newName;
    }
    public void setBroRoll(int newRoll) {
        broRoll = newRoll;
    }
    public void setBroAge (int newAge) {
        broAge = newAge;
    }
    // her degısken ıcın getter ve setter olusturduk
    /*
    butun degiskenler tek bır class altında derli toplu sekılde bulunuyor
    encapsulation yapısına uygun
     */
}
