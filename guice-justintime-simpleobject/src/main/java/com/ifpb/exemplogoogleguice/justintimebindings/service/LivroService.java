/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.justintimebindings.service;

import com.ifpb.exemplogoogleguice.justintimebindings.dao.LivroDao;
import com.google.inject.ImplementedBy;

/**
 *
 * @author romulo
 */
@ImplementedBy(LivroServiceImpl.class)
public interface LivroService {

    public LivroDao getDao();

}
