package br.com.melol.service;

import br.com.melol.dao.IProdutoDAO;
import br.com.melol.domain.Produto;

import java.util.List;

public class ProdutoService {

    @br.com.melol.service.Inject
    private IProdutoDAO produtoDAO;

    public void salvar(Produto produto) {
        produtoDAO.salvar(produto);
    }

    public Produto buscarPorId(Long id) {
        return produtoDAO.buscarPorId(id);
    }

    public void atualizar(Produto produto) {
        produtoDAO.atualizar(produto);
    }

    public void excluir(Long id) {
        produtoDAO.excluir(id);
    }

    public List<Produto> listarTodos() {
        return produtoDAO.listarTodos();
    }
}