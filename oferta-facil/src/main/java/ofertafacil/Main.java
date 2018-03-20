package ofertafacil;

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
        ControladorSms controller = injetor.getInstance(ControladorSms.class);
        controller.mandarMensagem(new Telefone("83","999999999"), "Oi tudo bem?");
    }
}
