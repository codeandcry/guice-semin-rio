/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.linkedbindings.classframework;

import com.google.inject.AbstractModule;
import com.ifpb.exemplogoogleguice.linkedbindings.dao.CalculaDao;
import com.ifpb.exemplogoogleguice.linkedbindings.dao.CalculaDaoImpl;
import com.ifpb.exemplogoogleguice.linkedbindings.service.CalculaService;
import com.ifpb.exemplogoogleguice.linkedbindings.service.CalculaServiceImpl;

/**
 *
 * @author romulo
 */
public class MyAbstractModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(CalculaDao.class).to(CalculaDaoImpl.class);

        bind(CalculaService.class).to(CalculaServiceImpl.class);

    }

}
