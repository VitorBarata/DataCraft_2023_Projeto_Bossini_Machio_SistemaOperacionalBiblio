
package Banco.Querys;

public class Querys {
    
    public String InsertUsuarios(){
        
        String query = "INSERT INTO tb_usuariu (login, nome, idade, sexo, senha, tipoLivro1)" +
                        "VALUES (?,?,?,?,?,?);";
        
        return query;
    }
    
    
    public String SelectLogin(){
        
        String query = "SELECT * FROM tb_usuariu WHERE login = ? and senha = ?";
        
        return query;
    }
    
    public String SelectUsuarios(){
        
       String query = "SELECT * FROM tb_usuariu";
        
       return query;
    }
    
    public String SelectUsuariosId(){
        
       String query = "SELECT * FROM tb_usuariu WHERE login = ? AND senha = ?";
        
       return query;
    }
     
    public String InsertNotas() {
         
        String query = "INSERT INTO tb_notaslivros (idLivro, idUsuario, nota) VALUES (?, ?, ?)";
         
        return query;
    }
     
    public String InsertLivros() {
         
        String query = "INSERT INTO tb_livros (titulo, autor, tipo) VALUES (?,?,?)";
         
        return query;
    }
    
    
    public String SelectLivros() {
         
        String query = "SELECT * FROM tb_livros WHERE nome = ?";
         
        return query;
    }
}
