import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;

/**
 *
 * @author paulohenrique
 * Test connection with Hibernate
 */

public class TestConnection {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate-tests.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try {
            Session session = sessionFactory.openSession();

            Query query = session.createNativeQuery("SELECT VERSION()");
            String version = (String) query.getSingleResult();
            System.out.println("SUCCESSFUL CONNECTION DB: " + version);

            session.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
