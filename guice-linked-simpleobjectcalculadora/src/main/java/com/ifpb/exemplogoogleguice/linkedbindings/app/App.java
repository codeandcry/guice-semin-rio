/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.linkedbindings.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ifpb.exemplogoogleguice.linkedbindings.classframework.MyAbstractModule;
import com.ifpb.exemplogoogleguice.linkedbindings.controlador.CalculaController;
import com.ifpb.exemplogoogleguice.linkedbindings.service.CalculaService;

/**
 *
 * @author romulo
 */
public class App {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new MyAbstractModule());

        CalculaService calculaService = injector.getInstance(CalculaService.class);

        CalculaController calculaController = new CalculaController(calculaService);
        
        System.out.println("A resposta é: " + calculaController.somar(2, 2));

    }

}
