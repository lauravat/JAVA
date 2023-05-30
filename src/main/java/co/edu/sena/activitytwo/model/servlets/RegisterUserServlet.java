package co.edu.sena.activitytwo.model.servlets;


import java.io.IOException;
import java.sql.SQLException;

import co.edu.sena.activitytwo.model.User;
import co.edu.sena.activitytwo.model.repository.Repository;
import co.edu.sena.activitytwo.model.repository.UserRepositoryImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register-user")
public class RegisterUserServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse responsive) throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Repository<User> repository = new UserRepositoryImpl();
        String user_firstname = request.getParameter("name");
        String user_lastname =request.getParameter("lastName");
        String user_email = request.getParameter("email");
        String user_password = request.getParameter("password");

        User userInsert = new User();
        int rows = 0;
        userInsert.setUser_firstname(user_firstname);
        userInsert.setUser_lastname(user_lastname);
        userInsert.setUser_email(user_email);
        userInsert.setUser_password(user_password);

        try {
            rows = repository.saveObj(userInsert);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (rows == 0) {
            System.out.println("error");
        } else {
            request.getRequestDispatcher("./Success.jsp").forward(request, response);
        }

    }
    
}
