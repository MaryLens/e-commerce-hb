package example.repos;

import example.domain.ICategoryRepository;
import example.entities.Category;
import jakarta.persistence.EntityManager;

public class CategoryRepository implements ICategoryRepository {

    private EntityManager em;

    public CategoryRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Category getById(Integer id) {
        return em.find(Category.class, id);
    }

    @Override
    public void create(Category category) {
        em.getTransaction().begin();
        em.persist(category);
        em.getTransaction().commit();

    }

    @Override
    public void update(Category category) {
        em.getTransaction().begin();
        em.merge(category);
        em.getTransaction().commit();

    }

    @Override
    public void remove(Category category) {
        em.getTransaction().begin();
        em.remove(category);
        em.getTransaction().commit();

    }

}
