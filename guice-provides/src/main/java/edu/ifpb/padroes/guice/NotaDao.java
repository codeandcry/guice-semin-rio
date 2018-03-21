
package edu.ifpb.padroes.guice;

import com.google.inject.Inject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lyndemberg
 */
public class NotaDao {
    @Inject
    private Connection conexao;
    
    public Nota buscarPorId(int id){
        Nota nota = null;
        try {
            PreparedStatement statement = conexao.prepareStatement("SELECT * FROM nota WHERE id=?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                nota = new Nota(rs.getInt("id"),rs.getString("titulo"),rs.getString("descricao"));
            }
            rs.close();
            statement.close();
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(NotaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nota;
    }
}
