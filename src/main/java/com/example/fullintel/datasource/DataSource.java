package com.example.fullintel.datasource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {

    public static synchronized Connection getConnection() throws IOException{

            Properties properties = new Properties();
            InputStream inputStream = new FileInputStream("D:\\FullintelDBconnection\\src\\main\\resources\\application.properties");
            properties.load(inputStream);
            String url = properties.getProperty("URL");
            String userName = properties.getProperty("USER_NAME");
            String password = properties.getProperty("PASSWORD");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, userName, password);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
            return null;
        }
        }
    }


