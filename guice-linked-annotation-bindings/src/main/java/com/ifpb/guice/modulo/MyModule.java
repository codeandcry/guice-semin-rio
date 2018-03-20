package com.ifpb.guice.modulo;

import com.google.inject.AbstractModule;
import com.ifpb.guice.dao.LivroDao;
import com.ifpb.guice.interfaces.LivroDaoAnnotation;
import com.ifpb.guice.interfaces.LivroDaoInterface;
import com.ifpb.guice.interfaces.LivroServiceInterface;
import com.ifpb.guice.service.LivroService;

/**
 *
 * @author jozimar
 */
public class MyModule extends AbstractModule {
    
    @Override
    public void configure() {
        
        bind(LivroDaoInterface.class).annotatedWith(LivroDaoAnnotation.class).to(LivroDao.class);
        
        bind(LivroServiceInterface.class).to(LivroService.class);
    }
}
