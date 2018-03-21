package com.padroes.googleguice.qualifiers;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 *
 * @author lyndemberg
 */
public class Module extends AbstractModule{
    
    @Override
    protected void configure(){
        bind(Sms.class).annotatedWith(Names.named("ChiaCorreio"))
                .to(SmsChiaCorreio.class);
        bind(Sms.class).annotatedWith(Names.named("OlaCorreio"))
                .to(SmsOlaCorreio.class);
    }
}
