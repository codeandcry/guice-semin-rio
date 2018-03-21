/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.linkedbindings.service;

import com.google.inject.Inject;
import com.ifpb.exemplogoogleguice.linkedbindings.dao.CalculaDao;

/**
 *
 * @author romulo
 */
public class CalculaServiceImpl implements CalculaService {

    private final CalculaDao calculaDao;

    @Inject
    public CalculaServiceImpl(CalculaDao calculaDao) {
        this.calculaDao = calculaDao;
    }

    @Override
    public CalculaDao getDao() {
        return calculaDao;
    }

}
