package co.edu.sena.activitytwo.model.servlets;

import java.io.IOException;
import java.sql.SQLException;

import co.edu.sena.activitytwo.model.Product;
import co.edu.sena.activitytwo.model.repository.ProductRepositoryimpl;
import co.edu.sena.activitytwo.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register-product")
public class RegisterProduct extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Repository<Product> repository = new ProductRepositoryimpl();
        String ProductName = req.getParameter("productname");
        Integer ProductValue = Integer.valueOf(req.getParameter("valueproduct"));
        Integer ProductCategory = Integer.valueOf(req.getParameter("idcategory"));
        Product productInsert = new Product();
        int rows =0;
        productInsert.setProduct_name(ProductName);
        productInsert.setProduct_values(ProductValue);
        productInsert.setCategory_id(ProductCategory);
        try {
            rows = repository.saveObj(productInsert);
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
