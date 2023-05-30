package co.edu.sena.activitytwo.model.repository;

import java.sql.SQLException;

import co.edu.sena.activitytwo.model.Category;

public class TestCategoryRepositoryimpl {
    public static void main(String[] args) throws SQLException {
        Repository<Category> repository = new CategoryRepositoryimpl();

        System.out.println("====== saveObj Insert ======");

        Category categoryInsert = new Category();
        categoryInsert.setCategory_name("Lactos");

        repository.saveObj(categoryInsert);

        categoryInsert.setCategory_name("Granos");
        repository.saveObj(categoryInsert);

        System.out.println("====listAllObj=====");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("====saveObj act====");

        Category categoryUpdate = new Category();
        categoryUpdate.setCategory_id(1);
        categoryUpdate.setCategory_name("Golosinas");
        repository.saveObj(categoryUpdate);

        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("====deleteObj====");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}
