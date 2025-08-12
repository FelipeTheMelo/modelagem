package br.com.melol.test;

import br.com.melol.dao.ProdutoDAO;
import br.com.melol.domain.Produto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class teste {

    private EntityManagerFactory emf;
    private EntityManager em;
    private ProdutoDAO produtoDAO;

    @Before
    public void setUp() {
        emf = Persistence.createEntityManagerFactory("meuPU");
        em = emf.createEntityManager();
        produtoDAO = new ProdutoDAO();
        produtoDAO.em = em; // injeta manualmente para o teste
    }

    @Test
    public void testSalvarEBuscar() {
        Produto produto = new Produto("Mouse Gamer", 199.90);

        em.getTransaction().begin();
        produtoDAO.salvar(produto);
        em.getTransaction().commit();

        Produto encontrado = produtoDAO.buscarPorId(produto.getId());
        Assert.assertNotNull(encontrado);
        Assert.assertEquals("Mouse Gamer", encontrado.getNome());
    }
}