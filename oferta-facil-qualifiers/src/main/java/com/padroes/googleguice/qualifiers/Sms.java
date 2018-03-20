package com.padroes.googleguice.qualifiers;

/**
 *
 * @author lyndemberg
 */
public interface Sms {
    void enviar(Telefone tel, String msg);
}
