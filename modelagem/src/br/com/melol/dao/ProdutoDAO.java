package br.com.melol.dao;

import br.com.melol.domain.Produto;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void salvar(Produto produto) {
        em.persist(produto);
    }

    @Override
    public Produto buscarPorId(Long id) {
        return em.find(Produto.class, id);
    }

    @Override
    @Transactional
    public void atualizar(Produto produto) {
        em.merge(produto);
    }

    @Override
    @Transactional
    public void excluir(Long id) {
        Produto p = buscarPorId(id);
        if (p != null) {
            em.remove(p);
        }
    }

    @Override
    public List<Produto> listarTodos() {
        return em.createQuery("FROM Produto", Produto.class).getResultList();
    }
}