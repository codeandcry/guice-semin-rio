package com.ifpb.guice.modulo;

import com.google.inject.AbstractModule;
import com.ifpb.guice.dao.LivroDao;
import com.ifpb.guice.interfaces.LivroDaoInterface;
import com.ifpb.guice.interfaces.LivroServiceInterface;
import com.ifpb.guice.service.LivroService;

/**
 *
 * @author jozimar
 */
public class MyAbstractModule extends AbstractModule {

    @Override
    public void configure() {

        bind(LivroDaoInterface.class).to(LivroDao.class);

        bind(LivroServiceInterface.class).to(LivroService.class);
    }

}
