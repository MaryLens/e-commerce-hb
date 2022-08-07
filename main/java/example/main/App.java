package example.main;

import example.entities.Category;
import example.entities.Product;
import example.repos.ProductRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {

        // jpa factory based on persistence.xml unit
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("local-pg");

        // entity manager
        EntityManager em = emf.createEntityManager();

        //CRUD
        //Create
        // Category cat1 = new Category(); // --- transient
        // cat1.setId(1);
        // cat1.setName("cup");

        // em.getTransaction().begin();
        // em.persist(cat1);
        // em.getTransaction().commit(); // --- persistent

        // Read + Update
        // Category cat1 = em.find(Category.class, 1);
        // System.out.println(cat1);
        //
        // cat1.setName("Category one"); //---detached

        // em.getTransaction().begin();
        // em.persist(cat1);
        // em.getTransaction().commit(); // --- persistent

        // read + Delete
        // Category cat1 = em.find(Category.class, 1);

        // em.getTransaction().begin();
        // em.remove(cat1);
        // em.getTransaction().commit(); // --- removed

        // ProductRepository prodRepo = new ProductRepository(em);
        //  prodRepo.create(new Product(cat1, 1, "tea cup", (short)10, 100.00) );

        //Product pr = prodRepo.getById(1);
        // pr.setName("cup of tea");
        // pr.setQuantity((short)100);
        // prodRepo.update(pr);
        //prodRepo.remove(pr);
    }
}
