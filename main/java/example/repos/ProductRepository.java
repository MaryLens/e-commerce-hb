package example.repos;

import example.domain.IProductRepository;
import example.entities.Product;
import jakarta.persistence.EntityManager;

public class ProductRepository implements IProductRepository {

    private EntityManager em;

    

    public ProductRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Product getById(Integer id) {
        return em.find(Product.class, id);
    }

    @Override
    public void create(Product product) {
        em.getTransaction().begin();
        em.persist(product);
        em.getTransaction().commit();
        
    }

    @Override
    public void update(Product product) {
        em.getTransaction().begin();
        em.merge(product);
        em.getTransaction().commit();
        
    }

    @Override
    public void remove(Product product) {
        em.getTransaction().begin();
        em.remove(product);
        em.getTransaction().commit();
        
    }
    
}
