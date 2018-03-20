package ofertafacil;

import com.google.inject.Inject;

/**
 *
 * @author lyndemberg
 */
public class ControladorSms {
    @Inject
    private Sms sms;
    
    public void mandarMensagem(Telefone tel, String msg){
        sms.enviar(tel, msg);
    }

}
