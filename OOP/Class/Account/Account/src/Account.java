import java.rmi.UnmarshalException;
import java.util.Scanner;

public class Account {
    Scanner scanner = new Scanner(System.in);

    int accountNo;
    String name;
    float amount;

    void insert(int accountno, String Name, float Amount) {
        accountno = accountno;
        name = Name;
        amount = Amount;
    }

    void deposit(float amt) {
        System.out.print("how much money will be append? : ");
        amt = scanner.nextFloat();
        amount = amount + amt;
        System.out.println("your new balance: " + amount);
    }

    void withdraw (float amt) {
        System.out.print("how much money will be withdraw? : ");
        if (amt < amount) {
            System.out.print(" you cant withdraw this amount..");
        }
        else {
            float with = scanner.nextFloat();
            with = amt;
            amount = amount - with;
            System.out.println("your new balance : " + amount);

        }
    }
}
