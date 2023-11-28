
package ControleDados;

import Banco.Querys.Querys;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author vitor
 */
   public class CtrllLivros {
    
    Querys _Query = new Querys();
    
    public boolean novoLivro (String nomeLivro, String nomeAutor, String tipo) {
        
        String sql = _Query.InsertLivros();
        
        try (Connection c = conection.ModuloConexao.conector()) {

            PreparedStatement ps = c.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, nomeLivro);
            ps.setString(2, nomeAutor);
              ps.setString(3, tipo);

            int linhasAfetadas = ps.executeUpdate();
            
            return linhasAfetadas > 0;
        }
        catch (Exception e) {
            
            e.printStackTrace();
            
            return false;
        }
    }
    
    public int pegarIdLivro(String nomeLivro) {
        
        String sql = _Query.SelectLivros();
        
        int idLivro = 0;
        
        try (Connection c = conection.ModuloConexao.conector() ){
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nomeLivro);

            ResultSet resultSet = ps.executeQuery();
            
            if(resultSet.next()){
                idLivro = resultSet.getInt("id");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return idLivro;
    }
}

    

