package testes;

import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ListaTodosProdutos {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("controleestoque");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        String jpql = "SELECT e FROM Produto e";
        List<Produto> produtos = em.createQuery(jpql, Produto.class).getResultList();
        em.close();
        produtos.forEach(System.out::println);
    }
}
