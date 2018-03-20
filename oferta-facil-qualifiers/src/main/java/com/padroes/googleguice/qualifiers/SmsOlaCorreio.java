package com.padroes.googleguice.qualifiers;
/**
 *
 * @author lyndemberg
 */
public class SmsOlaCorreio implements Sms{

    @Override
    public void enviar(Telefone tel, String msg) {
        System.out.println("Mensagem: " + msg);
        System.out.println("Enviado através de OlaCorreio");
    }
    
}
