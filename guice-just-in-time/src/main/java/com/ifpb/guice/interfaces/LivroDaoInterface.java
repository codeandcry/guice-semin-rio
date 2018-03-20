package com.ifpb.guice.interfaces;

import com.google.inject.ImplementedBy;
import com.ifpb.guice.dao.LivroDao;
import com.ifpb.guice.modelo.Livro;
import java.util.List;

/**
 *
 * @author jozimar
 */
@ImplementedBy(LivroDao.class)
public interface LivroDaoInterface {

    boolean salvar(Livro livro);

    boolean remover(Livro livro);

    List<Livro> todosOsLivros();
}
