
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CntrlNota {
    
    Querys _Query = new Querys();
    
    public boolean registrarNota(int valorNota, int idUser, int idLivro) {
        
        String sql = _Query.InsertNotas();
        
        try (Connection c = ConexaoBanco.obtemConexao()) {
            
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setInt(1, idLivro);
            ps.setInt(2, idUser);
            ps.setInt(3, valorNota);

            int rowsAffected = ps.executeUpdate();

            return rowsAffected > 0;
        }
        catch (Exception e) {
            e.printStackTrace();

            return false;
        }
    }
}
