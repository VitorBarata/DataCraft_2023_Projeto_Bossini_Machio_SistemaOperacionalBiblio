
package Model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login {
    
    private String login; 
    private String senha;
    
    public Login(){}
    
    public Login(String loginRecebido, String senhaRecebida){
        this.login = loginRecebido;
        this.senha = senhaRecebida;
    }
    
    public void setLogin(String loginRecebido){
        this.login = loginRecebido;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setSenha(String senhaRecebida){
        this.senha = senhaRecebida;
    }
    
    public String getSenha(){
        return senha;
    }   
}
