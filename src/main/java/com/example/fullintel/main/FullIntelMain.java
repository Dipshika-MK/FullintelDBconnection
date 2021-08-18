package com.example.fullintel.main;

import com.example.fullintel.dao.UserDao;
import com.example.fullintel.user.AppConfig;
//import com.fullintel.user.dao.UserDao;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
@SpringBootApplication
public class FullIntelMain {
	
        public static void main(String[] args) {
            //try {
               /* ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
                UserDao userDao = factory.getBean(UserDao.class);
                userDao.insertUser(new User("blah@gmail.com", "dhfiudshfe", "Roshan", "Romanse"));
                userDao.getUser("admin@capestart.com", "b85e2529d52e65a03acba2d8591b712c");

            } catch (BeansException e) {
                e.printStackTrace();*/

                //SpringApplication.run(FullIntelMain.class, args);

               // System.out.println("hi");
               SpringApplication.run(FullIntelMain.class, args);
                //UserDao userDao = context.getBean(UserDao.class);
              //  userDao.getUser("admin@capestart.com","b85e2529d52e65a03acba2d8591b712c");


/*
            } catch (Exception e) {
                System.out.println(e);
            }*/
        }

    }




    /* public class FullintelMain { // main to retrieve data from sql
   public static void main(String[] args) {

        UserDao userDao = new UserDao();

        try{
           userDao.selectAllUser();
            //userDao.insertUser();
            userDao.getUser("admin@capestart.com", "b85e2529d52e65a03acba2d8591b712c");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}*/
