
package ControleDados;

import Banco.Querys.Querys;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class CtrlNota {
    Querys _Query = new Querys();
    
   
    public boolean registrarNotas(int idLivro , int idUsuario, int notaLivro) {
        
        String sql = _Query.InsertNotas();
        
        try (Connection c = conection.ModuloConexao.conector()) {
            
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setInt(1, idLivro);
            ps.setInt(2, idUsuario);
            ps.setInt(3, notaLivro);

            int rowsAffected = ps.executeUpdate();

            return rowsAffected > 0;
        }
        catch (Exception e) {
            e.printStackTrace();

            return false;
        }
    }
}