package testes;

import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InclusaoDeProduto {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("controleestoque");
        EntityManager em = emf.createEntityManager();

        Produto prop = new Produto("Panela", "Panela de Pressão 10 Litros", 56.80);
        Produto prop2 = new Produto("Cama", "Cama de casal Big", 450.68);
        Produto prop3 = new Produto("Caixa Som", "Caixa de Som JBL", 160.00);

        em.getTransaction().begin();
        em.merge(prop);
        em.merge(prop2);
        em.merge(prop3);
        em.getTransaction().commit();
        em.close();
    }
}
