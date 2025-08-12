package br.com.melol.dao;

import br.com.melol.domain.Produto;
import java.util.List;

public interface IProdutoDAO {

    void salvar(Produto produto);

    Produto buscarPorId(Long id);

    void atualizar(Produto produto);

    void excluir(Long id);

    List<Produto> listarTodos();
}