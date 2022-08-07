package example.domain;

import example.entities.Category;

public interface ICategoryRepository {
    public Category getById(Integer id);
    public void create(Category category);
    public void update(Category category);
    public void remove(Category category);
    
}
