/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.linkedbindings.service;

import com.ifpb.exemplogoogleguice.linkedbindings.dao.LivroDao;

/**
 *
 * @author romulo
 */
public interface LivroService {

    public LivroDao getDao();

}
