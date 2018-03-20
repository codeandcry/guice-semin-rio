package com.ifpb.guice.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ifpb.guice.controlador.LivroController;
import com.ifpb.guice.modelo.Livro;
import com.ifpb.guice.interfaces.LivroServiceInterface;
import com.ifpb.guice.modulo.MyAbstractModule;
import com.ifpb.guice.modulo.MyModule;

/**
 *
 * @author jozimar
 */
public class Main {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new MyAbstractModule());

        LivroServiceInterface livroServiceInterface = injector.getInstance(LivroServiceInterface.class);

        LivroController livroController = new LivroController(livroServiceInterface);

        Livro livro = new Livro(1, "Saraiva", "EJB", "8-34343-435");

        livroController.adicionarLivro(livro);
        System.out.println(livroController.listarLivros());
    }

}
