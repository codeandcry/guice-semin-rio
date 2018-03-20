package com.padroes.googleguice.qualifiers;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

/**
 *
 * @author lyndemberg
 */
public class Main {
    public static void main(String[] args) {
        Injector injetor = Guice.createInjector(new Module());        
        Cliente1 cliente1 = injetor.getInstance(Cliente1.class);
        Cliente2 cliente2 = injetor.getInstance(Cliente2.class);
        
        cliente1.send(new Telefone("83","991102039"), "Veja nosso catálogo de ofertas");
        System.out.println("--------------");
        cliente2.send(new Telefone("83","998220390"), "Sua fatura está em atraso!");
        
    }
}
