package luca.campion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import luca.campion.dao.EventiDAO;
import luca.campion.entities.Eventi;
import luca.campion.entities.tipoEvento;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence_api");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

        // aggiunta di un concerto :
        EventiDAO sd = new EventiDAO(em);
        Eventi vasco = new Eventi("concerto di vasco rossi",200, tipoEvento.PUBBLICO,"Vasco in live");
        sd.save(vasco);

        // ricerca tramite id :
        Eventi test = sd.findBy(1);
        System.out.println(test);

        // elimina tramite id :
        sd.finByIdAndDelete(1);


        em.close();
        emf.close();
    }
}
