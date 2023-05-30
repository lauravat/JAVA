package co.edu.sena.activitytwo.model;

public class Product {
    private Integer product_id;
    private String product_name;
    private Integer product_values;
    private Integer category_id;

    public Product(Integer product_id, String product_name, Integer product_values, Integer category_id) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_values = product_values;
        this.category_id = category_id;
    }

    public Product() {
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getProduct_values() {
        return product_values;
    }

    public void setProduct_values(Integer product_values) {
        this.product_values = product_values;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ",product_name='" + product_name + '\'' +
                ",product_values='" + product_values + '\'' +
                ",category_id='" + category_id + '\'' +
                '}';
    }
}
