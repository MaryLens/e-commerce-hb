package example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

    @ManyToOne
    private Category category;
    @Id
    private Integer id;
    private String name;
    private short quantity;
    private double price;


    // DEFAULT CONSTRUCTOR
    public Product() {
    }

    // CONSTRUCTOR WITH FIELDS
    public Product(Category category, Integer id, String name, short quantity, double price) {
        this.category = category;
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // GETTERS AND SETTERS
    public Category getCategory() {
        return category;
    }

    public void Category(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Product [category=" + category + ", id=" + id + ", name=" + name + ", price=" + price + ", quantity="
                + quantity + "]";
    }


}
