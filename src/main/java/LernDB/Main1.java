package LernDB;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Main1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/educational_system";
        String username="root";//логин
        String password ="Alina1110358";//пароль

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT Name FROM student");

        while (resultSet.next()){
            String name= resultSet.getString("name");
            System.out.println("Name :"+name);
        }
        connection.close();
    }
}
