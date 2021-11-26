package by.itovereone.service;

import by.itovereone.entity.Teacher;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceTeacher {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/educational_system";
        String username = "root";//логин
        String password = "Alina1110358";//пароль

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT Id, Name, Age, SubjName FROM teacher");

        List<Teacher> teachers = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String subjName = resultSet.getString("SubjName");
            Teacher teacher = new Teacher(id, name, age, subjName);
            teachers.add(teacher);
            System.out.println("Name: " + name +'\'' + " id: " + id + '\''+ " age: " + age+"SubjName"+subjName);
        }
        connection.close();
    }
}


