/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.linkedbindings.app;

import com.ifpb.exemplogoogleguice.linkedbindings.controlador.LivroController;
import com.ifpb.exemplogoogleguice.linkedbindings.model.Livro;
import com.ifpb.exemplogoogleguice.linkedbindings.service.LivroService;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ifpb.exemplogoogleguice.linkedbindings.classframework.MyAbstractModule;

/**
 *
 * @author romulo
 */
public class App {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new MyAbstractModule());

        LivroService livroService = injector.getInstance(LivroService.class);

        LivroController livroController = new LivroController(livroService);

        Livro livro = new Livro("O motorista e o milionário", "Joachim de Posada");

        System.out.println(livroController.adicionarLivro(livro));
        System.out.println(livroController.listarLivros());

    }

}
