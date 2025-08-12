package br.com.melol.dao;

import java.util.List;

import br.com.melol.domain.Curso;

public interface ICursoDao {

    public Curso cadastrar(Curso curso);

    public void excluir(Curso cur);

    public List<Curso> buscarTodos();
}
