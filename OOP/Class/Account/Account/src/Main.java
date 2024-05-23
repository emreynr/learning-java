import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account acc1 = new Account();

         System.out.print("account no: ");
        int accno = scanner.nextInt();
        accno = acc1.accountNo;

        System.out.print("name: ");
        String Name = scanner.next();
        Name = acc1.name; // bu ters

        System.out.print("balance: ");
        float blc = scanner.nextFloat();
        acc1.amount = blc; // dogrusu bu, cunku blc degerini amounta
                           //esitliyoruz


        //acc1.insert(accno, Name, blc); olsa da olmasa da calisiyor
        // cok daha farkli yapmak sonradan aklima geldi bu sekilde daha
        // duzensiz oldu sanki
        // insert kullanmak yerine direkt buradan deger alip insert
        // olmadan esitlemek daha mantikl geldi onu da yapacagim

        acc1.deposit(blc);
        // acc1.withdraw(blc);





    }
}