package com.ifpb.guice.controlador;

import com.google.inject.Inject;
import com.ifpb.guice.modelo.Livro;
import com.ifpb.guice.interfaces.LivroServiceInterface;
import java.util.List;

/**
 *
 * @author jozimar
 */
public class LivroController {

    private LivroServiceInterface service;

    @Inject
    public LivroController(LivroServiceInterface service) {
        this.service = service;
    }

    public boolean adicionarLivro(Livro livro) {
        return service.getDao().salvar(livro);
    }

    public boolean excluirLivro(Livro livro) {
        return service.getDao().remover(livro);
    }

    public List<Livro> listarLivros() {
        return service.getDao().todosOsLivros();
    }
}
