/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.exemplogoogleguice.linkedbindings.classframework;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.ifpb.exemplogoogleguice.linkedbindings.dao.LivroDao;
import com.ifpb.exemplogoogleguice.linkedbindings.dao.LivroDaoImpl;
import com.ifpb.exemplogoogleguice.linkedbindings.service.LivroService;
import com.ifpb.exemplogoogleguice.linkedbindings.service.LivroServiceImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author romulo
 */
public class MyAbstractModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(LivroDao.class).to(LivroDaoImpl.class);

        bind(LivroService.class).to(LivroServiceImpl.class);

    }

    @Provides
    public Connection getConnectionPostgre()
            throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/myprovides";
        String usuario = "postgres";
        String senha = "postgres";
        return DriverManager.getConnection(url, usuario, senha);
    }

}
