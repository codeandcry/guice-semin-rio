/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.justintimebindings.dao;

import com.ifpb.exemplogoogleguice.justintimebindings.model.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author romulo
 */
public class LivroDaoImpl implements LivroDao {
    
    private final List<Livro> livros;
    
    public LivroDaoImpl(){
        this.livros = new ArrayList<>();
    }
    
    @Override
    public boolean save(Livro livro) {
        return this.livros.add(livro);
    }

    @Override
    public boolean remove(Livro livro) {
        return  this.livros.remove(livro);
    }

    @Override
    public List<Livro> findAll() {
        return this.livros;
    }
    
}
