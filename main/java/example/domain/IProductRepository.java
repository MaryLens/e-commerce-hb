package example.domain;

import example.entities.Product;

public interface IProductRepository {
    public Product getById(Integer id);
    public void create(Product product);
    public void update(Product product);
    public void remove(Product product);
    
}
