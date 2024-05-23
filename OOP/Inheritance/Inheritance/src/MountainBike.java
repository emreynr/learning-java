// Bicycle classindan extends edecegiz
// extends yani bu class Bicycle classina kadar uzanir anlamina gelir ve
// ozelliklerini bu sekilde miras alip kullanabilir
public class MountainBike extends Bicycle{
    // extends edip birakirsak 'constructor yok' hatasi aliriz

    public int seatHeight;
    // sadece bu classa ozgu bir ozellik ekledik

    public MountainBike(int Gear, int Speed, int seatHeight) {
        super(Gear, Speed); // bu iki ozellik base classtan geldi, super kullanilmali
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // ayrica base classtan toString metodunu override ettik
    @Override
    public String toString() {
        return (super.toString() + " \n seat height is: " + seatHeight);
    }
}
// sub class olusturduktan sonra main() altinda kullanacagiz
/*
dikkat ettiysen burada sadece seat height ciktisi veren bir metod var fakat program cikti olarak hem Bicycle hem de MountainBike altndaki ciktilari veriyor
boylece extends ederek base classin ozellilerini sub classa genisletmis olduk
 */