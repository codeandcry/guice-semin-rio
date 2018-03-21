/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.justintimebindings.dao;

import com.ifpb.exemplogoogleguice.justintimebindings.model.Livro;
import com.google.inject.ImplementedBy;
import java.util.List;

/**
 *
 * @author romulo
 */
@ImplementedBy(LivroDaoImpl.class)
public interface LivroDao {

    public boolean save(Livro livro);

    public boolean remove(Livro livro);

    public List<Livro> findAll();

}
