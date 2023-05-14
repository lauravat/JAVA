package co.edu.sena.activitytwo.model.repository;


import java.sql.SQLException;

import co.edu.sena.activitytwo.model.User;

public class TestUserRepositoriImpl {
    public static void main(String[] args) throws SQLException{
        Repository<User> repository = new UserRepositoryImpl();

        System.out.println("====== saveObj Insert ======");//insert
        User userInsert = new User();
        userInsert.setUser_firstname("Laura");
        userInsert.setUser_lastname("Aguilar");
        userInsert.setUser_email("lau3232435124@gmail.com");
        userInsert.setUser_password("Laura_Vat");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("Valentina");
        userInsert.setUser_lastname("Talero");
        userInsert.setUser_email("laura3232435124@gmail.com");
        userInsert.setUser_password("Laura_Vat2");
        repository.saveObj(userInsert);

        System.out.println("====listAllObj=====");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("====saveObj act====");//update
        User userUpdate = new User();
        userUpdate.setUser_id(1);
        userUpdate.setUser_firstname("Ximena");
        userUpdate.setUser_lastname("Jimenez");
        userUpdate.setUser_email("ximena3@gmail.com");
        userUpdate.setUser_password("Ximena_45-3");
        repository.saveObj(userUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();
        
            System.out.println("====deleteObj====");
            repository.deleteObj(2);
            repository.listAllObj().forEach(System.out::println);
    }
}
