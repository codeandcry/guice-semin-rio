package ofertafacil;

import com.google.inject.AbstractModule;

/**
 *
 * @author lyndemberg
 */
public class Module extends AbstractModule{
    
    @Override
    protected void configure(){
        bind(Sms.class).to(SmsOlaCorreio.class);
    }
}
