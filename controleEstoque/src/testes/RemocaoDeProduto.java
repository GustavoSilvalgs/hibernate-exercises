package testes;

import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemocaoDeProduto {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("controleestoque");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Produto produto = em.find(Produto.class, 3L);
        em.remove(produto);
        em.getTransaction().commit();
        em.close();
        System.out.println("Pronto!");

    }
}
