package example.demo;

import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Service;

@Service
public class HibernateService {
    private SessionFactory sessionFactory;
    private Session session; //Session je objekt, který umožňuje vytvářet a spravovat transakce, pro vytvoření voláme metodu getTransaction,
    // po provedení operace v DB voláme commit nebo rollback.

    public HibernateService() {
        initSessionFactory();
    }

    public void initSessionFactory() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            session = sessionFactory.openSession();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
            throw ex;
        }
    }

    public Session getSession() {
        return session;
    }

}
