
package com.padroes.googleguice.qualifiers;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 *
 * @author lyndemberg
 */
public class Cliente2 {
    @Inject
    @Named("OlaCorreio")
    private Sms sender;
    
    public void send(Telefone tel, String msg){
        sender.enviar(tel, msg);
    }
}
