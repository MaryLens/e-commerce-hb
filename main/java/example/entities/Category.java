package example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Category {

    @Id
    
    private Integer id;
    private String name;

    // DEFAULT CONSTRUCTOR
    public Category() {

    }

    // CONSTRUCTOR WITH FIELDS
    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // GETTERS AND SETTERS
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

    // TO STRING
    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
    }

}
