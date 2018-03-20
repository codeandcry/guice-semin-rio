package com.ifpb.guice.service;

import com.google.inject.Inject;
import com.ifpb.guice.interfaces.LivroDaoInterface;
import com.ifpb.guice.interfaces.LivroServiceInterface;

/**
 *
 * @author jozimar
 */
public class LivroService implements LivroServiceInterface {

    private LivroDaoInterface dao;

    @Inject
    public LivroService(LivroDaoInterface dao) {
        this.dao = dao;
    }

    @Override
    public LivroDaoInterface getDao() {
        return dao;
    }
}
