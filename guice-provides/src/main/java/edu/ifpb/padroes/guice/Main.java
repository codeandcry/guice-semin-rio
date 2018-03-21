/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.padroes.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 *
 * @author lyndemberg
 */
public class Main {
    public static void main(String[] args) {
        Injector injetor = Guice.createInjector(new Module());
        NotaDao dao = injetor.getInstance(NotaDao.class);
        Nota nota = dao.buscarPorId(151);
        System.out.println(nota.toString());
    }
}
