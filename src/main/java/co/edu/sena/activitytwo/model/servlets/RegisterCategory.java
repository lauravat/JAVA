package co.edu.sena.activitytwo.model.servlets;

import java.io.IOException;
import java.sql.SQLException;

import co.edu.sena.activitytwo.model.Category;
import co.edu.sena.activitytwo.model.repository.CategoryRepositoryimpl;
import co.edu.sena.activitytwo.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register-category")
public class RegisterCategory extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Repository<Category> repository = new CategoryRepositoryimpl();
        String name_category = req.getParameter("name_category");
        Category categoryInsert =new Category();
        int rows = 0;
        categoryInsert.setCategory_name(name_category);
        try {
            rows =repository.saveObj(categoryInsert);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        if (rows ==0) {
            System.out.println("error");
        } else {
            req.getRequestDispatcher("./Success.jsp").forward(req, resp);
        }
    }

}