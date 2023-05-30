package co.edu.sena.activitytwo.model.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import co.edu.sena.activitytwo.model.Category;
import co.edu.sena.activitytwo.util.ConectionPool;

public class CategoryRepositoryimpl implements Repository<Category> {

    private String sql = null;

    @Override
    public Category createObj(ResultSet rs) throws SQLException {
        Category category = new Category();
        category.setCategory_id(rs.getInt("category_id"));
        category.setCategory_name(rs.getString("category_name"));
        return category;
    }

    @Override
    public List<Category> listAllObj() throws SQLException {
        sql = "select category_id,category_name from category;";
        List<Category> categories = new ArrayList<>();
        try (Connection conn = ConectionPool.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Category u = createObj(rs);
                categories.add(u);
            }
        }
        return categories;
    }

    @Override
    public Category byIdObj(Integer id) throws SQLException {
        sql = "select category_id,category_name from category where category_id=?;";
        Category category = null;

        try (Connection conn = ConectionPool.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    category = createObj(rs);
                }
            }
        }
        return category;
    }

    @Override
    public Integer saveObj(Category category) throws SQLException {
        int rowsAffected = 0;
        if (category.getCategory_id() != null && category.getCategory_id() > 0) {
            sql = "update category set category_name = ? where category_id = ?";
        } else {
            sql = "insert into category (category_name) values (lower(?));";
        }
        try (Connection conn = ConectionPool.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, category.getCategory_name());
            if (category.getCategory_id() != null && category.getCategory_id() > 0) {
                ps.setInt(2, category.getCategory_id());
            }
            rowsAffected = ps.executeUpdate();
        }
        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "delete from category where category_id = ?";
        try (Connection conn = ConectionPool.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

}
