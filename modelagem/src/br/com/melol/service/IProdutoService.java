package br.com.melol.service;

import br.com.melol.domain.Produto;
import br.com.melol.exceptions.DAOException;
import br.com.melol.exceptions.MaisDeUmRegistroException;
import br.com.melol.exceptions.TableException;

public interface IProdutoService {

    Boolean cadastrar(Produto produto) throws TipoChaveNaoEncontradaException;

    void excluir(Long id);

    void alterar(Produto produto) throws TipoChaveNaoEncontradaException;

    Produto consultar(Long id) throws MaisDeUmRegistroException, TableException, DAOException;
}
