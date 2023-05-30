package co.edu.sena.activitytwo.model.repository;

import java.sql.SQLException;

import co.edu.sena.activitytwo.model.Product;

public class TestProductRepositoryimpl {
    public static void main(String[] args) throws SQLException {
        Repository<Product> repository = new ProductRepositoryimpl();

        System.out.println("====== saveObj Insert ======");

        Product productInsert = new Product();

        productInsert.setProduct_name("Leche");
        productInsert.setProduct_values(3000);
        productInsert.setCategory_id(1);
        repository.saveObj(productInsert);

        productInsert.setProduct_name("Frijoles");
        productInsert.setProduct_values(4500);
        productInsert.setCategory_id(3);
        repository.saveObj(productInsert);

        System.out.println("====listAllObj=====");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("====saveObj act====");

        Product productUpdate = new Product();
        productUpdate.setProduct_id(2);
        productUpdate.setProduct_name("Granola");
        productUpdate.setProduct_values(5000);
        productUpdate.setCategory_id(1);
        repository.saveObj(productUpdate);

        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("====deleteObj====");

        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}
