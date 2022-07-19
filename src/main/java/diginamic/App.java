package diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("pu_petstore");
        EntityManager em = emf.createEntityManager();
        //EntityTransaction tr = em.getTransaction();
        
       
        em.close();
        emf.close();
        
        
        
        
        
    }
}
