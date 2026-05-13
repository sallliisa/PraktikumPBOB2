import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "gamer42069");


        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);

        Statement statement = con.createStatement();
        statement.executeUpdate(query);

        con.close();
    }
}
