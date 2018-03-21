/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.linkedbindings.dao;

import com.ifpb.exemplogoogleguice.linkedbindings.model.Livro;
import java.util.List;

/**
 *
 * @author romulo
 */
public interface LivroDao {

    public boolean save(Livro livro);

    public boolean remove(Livro livro);

    public List<Livro> findAll();

}
