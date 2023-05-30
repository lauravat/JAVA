package co.edu.sena.activitytwo.model.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import co.edu.sena.activitytwo.model.Product;
import co.edu.sena.activitytwo.util.ConectionPool;

public class ProductRepositoryimpl implements Repository<Product> {
    private String sql = null;

    @Override
    public Product createObj(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setProduct_id(rs.getInt("product_id"));
        product.setProduct_name(rs.getString("product_name"));
        product.setProduct_values(rs.getInt("product_values"));
        product.setCategory_id(rs.getInt("category_id"));
        return product;
    }

    @Override
    public List<Product> listAllObj() throws SQLException {
        sql = "select product_id,product_name,product_values,category_id from product;";
        List<Product> products = new ArrayList<>();
        try (Connection conn = ConectionPool.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Product u = createObj(rs);
                products.add(u);
            }
        }
        return products;
    }

    @Override
    public Product byIdObj(Integer id) throws SQLException {
        sql = "select product_id,product_name,product_values,category_id from product where product_id=?;";
        Product product = null;

        try (Connection conn = ConectionPool.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    product = createObj(rs);
                }
            }
        }
        return product;
    }

    @Override
    public Integer saveObj(Product product) throws SQLException {
        int rowsAffected = 0;
        if (product.getProduct_id() != null && product.getProduct_id() > 0) {
            sql = "update product set product_name = ?, product_values = ?, category_id =? where product_id = ?";
        } else {
            sql = "insert into product (product_name,product_values,category_id) values(lower(?),?,?)";
        }
        try (Connection conn = ConectionPool.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, product.getProduct_name());
            ps.setInt(2, product.getProduct_values());
            ps.setInt(3, product.getCategory_id());
            if (product.getProduct_id() != null && product.getProduct_id() > 0) {
                ps.setInt(4, product.getProduct_id());
            }
            rowsAffected = ps.executeUpdate();
        }
        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "delete from product where product_id = ?";
        try (Connection conn = ConectionPool.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } // close try
    }

}
