/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.padroes.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lyndemberg
 */
public class Module extends AbstractModule{
    @Override
    protected void configure(){
        
    }
    
    @Provides
    public Connection provideConnectionPostgres() throws SQLException{
        String url = "jdbc:postgresql://localhost:5432/notas-app";
        String usuario = "postgres";
        String senha = "pgadmin";
        return DriverManager.getConnection(url,usuario,senha);
    }
}
