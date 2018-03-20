package com.ifpb.guice.dao;

import com.ifpb.guice.modelo.Livro;
import com.ifpb.guice.interfaces.LivroDaoInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jozimar
 */
public class LivroDao implements LivroDaoInterface {

    private List<Livro> livros;

    public LivroDao() {
        livros = new ArrayList<>();
    }

    @Override
    public boolean salvar(Livro livro) {
        return livros.add(livro);
    }

    @Override
    public boolean remover(Livro livro) {
        return livros.remove(livro);
    }

    @Override
    public List<Livro> todosOsLivros() {
        return livros;
    }
}
