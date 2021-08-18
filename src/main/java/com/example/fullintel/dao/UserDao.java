package com.example.fullintel.dao;

import com.example.fullintel.datasource.DataSource;
import com.example.fullintel.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Component("getUser")



public class UserDao {
    static String SELECT_USER = "select * from user where Email=? and Password =?";
    private static final String INSERT_USER = "insert into user" + "(Email, Password, FirstName, LastName ) VALUES " + "(?, ?, ?, ?);";


    public List<User> selectAllUser() throws Exception {
        List<User> user = new ArrayList<>();

        try (Connection connection = DataSource.getConnection()) {
            assert connection != null;
            try (Statement statement = connection.createStatement()) {

                boolean hasResultSet = statement.execute("SELECT Id, Email,Password, FirstName, LastName FROM fullintel.user");

                if (hasResultSet) {
                    ResultSet rs = statement.getResultSet();
                    while (rs.next()) {
                        Integer userId = rs.getInt("Id");
                        String userEmail = rs.getString("Email");
                        String userPassword = rs.getString("Password");

                        String firstName = rs.getString("FirstName");
                        String lastName = rs.getString("LastName");

                        user.add(new User(userId, userEmail, userPassword,firstName, lastName));
                    }
                }
            }
        }
        return user;
    }


    public void insertUser() throws Exception {

        try (Connection connection = DataSource.getConnection()) {
            assert connection != null;
            try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO user(Email, Password, FirstName, LastName) VALUES(?, ?, ?, ?)")) {

                User user = new User();
                //user.setId(201);
                user.setEmail("dipshika@capestart.com");
                user.setPassword("aaa");
                user.setFirstName("Dipshika");
                user.setLastName("MK");
                //preparedStatement.setInt(1, user.getId());
                preparedStatement.setString(1, user.getEmail());
                preparedStatement.setString(2, user.getPassword());
                preparedStatement.setString(3, user.getFirstName());
                preparedStatement.setString(4, user.getLastName());

                preparedStatement.executeUpdate();

            }
        }

    }
    @Autowired
    @Qualifier("getUser")
    public void getUser(String email, String password)  {
        try (Connection connection = DataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER);) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet rs = preparedStatement.executeQuery();
            //SqlCommand cmd = new SqlCommand();
            while (rs.next()) {
                int id = rs.getInt("id");
                String Email = rs.getString("Email");
                String Password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                System.out.println(id + " " + Email + " " + Password + " " + firstName + " " + lastName);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

