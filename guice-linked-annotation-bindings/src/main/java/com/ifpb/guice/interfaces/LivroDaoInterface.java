package com.ifpb.guice.interfaces;

import com.ifpb.guice.modelo.Livro;
import java.util.List;

/**
 *
 * @author jozimar
 */
public interface LivroDaoInterface {

    boolean salvar(Livro livro);

    boolean remover(Livro livro);

    List<Livro> todosOsLivros();
}
