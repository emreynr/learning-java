import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    //db baglantısını yapacak degıskenlerı tanımlıyoruz

    static Connection connection = null;
    static String databaseName = "";
    static String url = "jdbc:mysql://localhost:3306/" + databaseName;
    static String username = "root";
    static String password = "123456";

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.Driver").newInstance();
        connection = DriverManager.getConnection(url, username, password);
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO 'consumerDatabase', 'student' (name) VALUES ('michael); ");

        int status = preparedStatement.executeUpdate();

        if (status != 0) {
            System.out.println("databse was connection");
            System.out.println("record was inserted");
        }


    }
}